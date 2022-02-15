
def mapping = [
    [ server : "dataserver",    path : "/env1/scripts/",    script  : "dataserver.sh" ],
    [ server : "engineserver",    path : "/env1/scripts/",    script  : "engineserver.sh" ]
]

def f = new File('jenkinstemplate.service')
def engine = new groovy.text.GStringTemplateEngine()
def template = engine.createTemplate(f).make([mapping: mapping])
//def out =  template.toString()
new File('/home/nareshb/SCRIPT/groovy','systemdservicefull.service') << template.toString()