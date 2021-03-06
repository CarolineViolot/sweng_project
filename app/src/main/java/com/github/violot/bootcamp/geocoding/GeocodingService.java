package com.github.violot.bootcamp.geocoding;

import androidx.annotation.NonNull;

import java.io.IOException;

import com.github.violot.bootcamp.location.Location;

/**
 * This service enables you to get a {@link com.github.violot.bootcamp.location.Location} from a String
 * representing a location (i.e. a city, a street, a country...), or to get a {@link Address} from
 * a {@link com.github.violot.bootcamp.location.Location}
 */
public interface GeocodingService {

    /**
     * Gets the location of a textual address
     *
     * @param address the address, i.e. Lausanne, Switzerland
     * @return the location for this address
     *
     * @throws IOException if the network is unavailable
     */
    Location getLocation(@NonNull String address) throws IOException;

    /**
     * Get the address corresponding to a location
     *
     * @param location the location for which you want an address
     * @return the address of this location
     *
     * @throws IOException if the network is unavailable
     */
    Address getAddress(@NonNull Location location) throws IOException;
}