package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;

import static org.mockito.Mockito.*;

class WeatherAlertServiceTest {

    private WeatherAlertService service;
    private WeatherAlertService spyService;
    private Person alice;
    private Person bob;
    private Location cityA;
    private Location cityB;

    @BeforeEach
    void setUp() {
        service = new WeatherAlertService();
        spyService = Mockito.spy(service);

        alice = new Person("Alice", "alice@example.com");
        bob = new Person("Bob", "bob@example.com");
        cityA = new Location("CityA");
        cityB = new Location("CityB");
    }

    @Test
    void testSubscribeAndNotifyLocation() {
        spyService.subscribe(alice, cityA);
        spyService.subscribe(bob, cityA);

        spyService.notifyLocation(cityA, "Hail warning!");
        verify(spyService).sendMessage(alice, "Hail warning!");
        verify(spyService).sendMessage(bob, "Hail warning!");
    }

    @Test
    void testUnsubscribeFromLocation() {
        spyService.subscribe(alice, cityA);
        spyService.unsubscribe(alice, cityA);

        spyService.notifyLocation(cityA, "Storm warning!");
        verify(spyService, never()).sendMessage(any(), any());
    }

    @Test
    void testUnsubscribeFromAll() {
        spyService.subscribe(alice, cityA);
        spyService.subscribe(alice, cityB);

        spyService.unsubscribeFromAll(alice);
        spyService.notifyAll("General info");
        verify(spyService, never()).sendMessage(any(), any());
    }

    @Test
    void testNotifyAll() {
        spyService.subscribe(alice, cityA);
        spyService.subscribe(bob, cityB);

        spyService.notifyAll("Important info");
        verify(spyService).sendMessage(alice, "Important info");
        verify(spyService).sendMessage(bob, "Important info");
    }

    @Test
    void testDeleteLocation() {
        spyService.subscribe(alice, cityA);
        spyService.deleteLocation(cityA);

        spyService.notifyLocation(cityA, "Flood warning");
        verify(spyService, never()).sendMessage(any(), any());
    }
}

