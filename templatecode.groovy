def createMonitoringFiles(templateFile,monitoringFilePath,monitoringFileName){
   def value = [ 'env' : "deployment"] 
   def f = new File(templateFile)
   def engine = new groovy.text.GStringTemplateEngine()
   def template = engine.createTemplate(f).make(value)
   new File(monitoringFilePath,monitoringFileName) << template.toString()

}

createMonitoringFiles('template1.service','./','localhost.service')