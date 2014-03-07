application {
    title = 'YABA'
    startupGroups = ['sfBrokerApi']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "sfMsg"
    'sfMsg' {
        model      = 'sfbrokerapi.SfMsgModel'
        view       = 'sfbrokerapi.SfMsgView'
        controller = 'sfbrokerapi.DialogController'
    }

    // MVC Group for "preferences"
    'preferences' {
        model      = 'sfbrokerapi.PreferencesModel'
        view       = 'sfbrokerapi.PreferencesView'
        controller = 'sfbrokerapi.DialogController'
    }

    // MVC Group for "license"
    'license' {
        model      = 'sfbrokerapi.LicenseModel'
        view       = 'sfbrokerapi.LicenseView'
        controller = 'sfbrokerapi.DialogController'
    }

    // MVC Group for "credits"
    'credits' {
        model      = 'sfbrokerapi.CreditsModel'
        view       = 'sfbrokerapi.CreditsView'
        controller = 'sfbrokerapi.DialogController'
    }

    // MVC Group for "about"
    'about' {
        model      = 'sfbrokerapi.AboutModel'
        view       = 'sfbrokerapi.AboutView'
        controller = 'sfbrokerapi.DialogController'
    }

    // MVC Group for "sfBrokerApi"
    'sfBrokerApi' {
        model      = 'sfbrokerapi.SfBrokerApiModel'
        view       = 'sfbrokerapi.SfBrokerApiView'
        controller = 'sfbrokerapi.SfBrokerApiController'
    }

}
