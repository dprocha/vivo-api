SOURCE_IMAGE = os.getenv("SOURCE_IMAGE", default='tapf3658e5b.azurecr.io/tap/sc/vivo-4-0/vivo-api-source')
LOCAL_PATH = os.getenv("LOCAL_PATH", default='.')
NAMESPACE = os.getenv("NAMESPACE", default='vivo-4-0')

k8s_custom_deploy(
    'vivo-api',
    apply_cmd="tanzu apps workload apply -f config/workload.yaml --live-update" +
               " --local-path " + LOCAL_PATH +
               " --source-image " + SOURCE_IMAGE +
               " --namespace " + NAMESPACE +
               " --yes >/dev/null" +
               " && kubectl get workload vivo-api --namespace " + NAMESPACE + " -o yaml",
    delete_cmd="tanzu apps workload delete -f config/workload.yaml --namespace " + NAMESPACE + " --yes",
    deps=['pom.xml', './target/classes'],
    container_selector='workload',
    live_update=[
      sync('./target/classes', '/workspace/BOOT-INF/classes')
    ]
)

k8s_resource('vivo-api', port_forwards=["8080:8080"],
            extra_pod_selectors=[{'serving.knative.dev/service': 'vivo-api'}])

allow_k8s_contexts('tap-iterate-admin')