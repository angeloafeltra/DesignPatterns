package org.example.builders;

import org.example.cars.CarType;
import org.example.components.Engine;
import org.example.components.GPSNavigator;
import org.example.components.Transmission;
import org.example.components.TripComputer;

public abstract class Builder {

    public abstract void setCarType(CarType type);
    public abstract void setSeats(int seats);
    public abstract void setEngine(Engine engine);
    public abstract void setTransmission(Transmission transmission);
    public abstract void setTripComputer(TripComputer tripComputer);
    public abstract void setGPSNavigator(GPSNavigator gpsNavigator);
}
