package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherNotificationServiceTestSuite {
    WeatherNotificationService weatherNotificationService = new WeatherNotificationService();
    User user = Mockito.mock(User.class);
    User secondUser = Mockito.mock(User.class);
    User thirdUser = Mockito.mock(User.class);


    @Test
    public void shouldSubscribeAndNotifyLocation() {
        weatherNotificationService.subscribe(user, "New York");
        weatherNotificationService.notifyLocation("New York", "Heavy rain");

        Mockito.verify(user, Mockito.times(1)).receiveNotification("Heavy rain");
    }

    @Test
    public void shouldUnsubscribeFromLocation() {
        weatherNotificationService.subscribe(user, "New York");
        weatherNotificationService.unsubscribe(user, "New York");
        weatherNotificationService.notifyLocation("New York", "Snowstorm");

        Mockito.verify(user, Mockito.never()).receiveNotification("Snowstorm");
    }

    @Test
    public void shouldUnsubscribeFromAll() {
        weatherNotificationService.subscribe(user, "Houston");
        weatherNotificationService.subscribe(user, "Los Angeles");
        weatherNotificationService.unsubscribeFromAll(user);
        weatherNotificationService.notifyLocation("Houston", "Storm");
        weatherNotificationService.notifyLocation("Los Angeles", "Heatwave");

        Mockito.verify(user, Mockito.never()).receiveNotification(Mockito.anyString());
    }

    @Test
    public void shouldNotifyUsersInSpecificLocation() {
        weatherNotificationService.subscribe(user, "Houston");
        weatherNotificationService.subscribe(secondUser, "Miami");
        weatherNotificationService.subscribe(thirdUser, "Houston");
        weatherNotificationService.notifyLocation("Houston", "Sunny");

        Mockito.verify(user, Mockito.times(1)).receiveNotification("Sunny");
        Mockito.verify(secondUser, Mockito.never()).receiveNotification(Mockito.anyString());
        Mockito.verify(thirdUser,  Mockito.times(1)).receiveNotification("Sunny");

    }

    @Test
    public void shouldNotifyAllUsers() {
        weatherNotificationService.subscribe(user, "New York");
        weatherNotificationService.subscribe(secondUser, "Miami");
        weatherNotificationService.subscribe(thirdUser, "Boston");
        weatherNotificationService.notifyAllUsers("Service maintenance");

        Mockito.verify(user, Mockito.times(1)).receiveNotification("Service maintenance");
        Mockito.verify(secondUser, Mockito.times(1)).receiveNotification("Service maintenance");
        Mockito.verify(thirdUser, Mockito.times(1)).receiveNotification("Service maintenance");
    }

    @Test
    public void shouldRemoveLocation() {

        weatherNotificationService.subscribe(user, "Tampa");
        weatherNotificationService.removeLocation("Tampa");
        weatherNotificationService.notifyLocation("Tampa", "Thunderstorm");

        Mockito.verify(user, Mockito.never()).receiveNotification(Mockito.anyString());
    }
}
