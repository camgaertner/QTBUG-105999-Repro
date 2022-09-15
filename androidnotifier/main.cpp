
#include <QFont>

#include <QGuiApplication>
#include <QQmlApplicationEngine>
#include <QJniEnvironment>
#include <QJniObject>
#include <QDebug>

#include "notificationclient.h"

int main(int argc, char *argv[])
{
    QGuiApplication app(argc, argv);
    QQmlApplicationEngine engine;

    engine.load(QUrl("qrc:/qml/Main.qml"));

    NotificationClient().setNotification("trigger");

    int status = app.exec();

    return status;
}

