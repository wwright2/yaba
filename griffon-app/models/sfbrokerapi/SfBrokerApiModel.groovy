package sfbrokerapi

class SfBrokerApiModel {
    @Bindable String status

    void mvcGroupInit(Map args) {
        status = "Welcome to ${GriffonNameUtils.capitalize(app.getMessage('application.title'))}"
    }
}
