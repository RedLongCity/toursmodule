package com.smitsworks.toursmodule.convertor;

import java.net.URI;
import java.util.Optional;

public interface RequestConvertor<T> {

    Optional<URI> getRequestConvertedToPath(T object);
}
