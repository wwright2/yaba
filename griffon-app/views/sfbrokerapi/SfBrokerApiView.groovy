package sfbrokerapi

build(SfBrokerApiActions)

frame=application(title: GriffonNameUtils.capitalize(app.getMessage('application.title', app.config.application.title)),
    pack: true,
    locationByPlatform:true,
    iconImage: imageIcon('/yaba-icon-48x48.png').image,
    iconImages: [imageIcon('/yaba-icon-48x48.png').image,
               imageIcon('/yaba-icon-32x32.png').image,
               imageIcon('/yaba-icon-16x16.png').image]) {

   widget(build(SfBrokerApiMenuBar))
   migLayout(layoutConstraints: 'fill')
   widget(build(SfBrokerApiContent), constraints: 'center, grow')
   widget(build(SfBrokerApiStatusBar), constraints: 'south, grow')
}

frame.setSize(480,640)