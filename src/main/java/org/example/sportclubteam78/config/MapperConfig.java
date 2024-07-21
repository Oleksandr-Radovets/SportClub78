package org.example.sportclubteam78.config;

import org.mapstruct.CollectionMappingStrategy;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.ReportingPolicy;
import org.springframework.context.annotation.Configuration;


@org.mapstruct.MapperConfig(
        componentModel = "spring",
        collectionMappingStrategy = CollectionMappingStrategy.ACCESSOR_ONLY,
        unmappedSourcePolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.FIELD,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS,
        implementationPackage = "<PACKAGE_NAME>.impl"
)
@Configuration
public class MapperConfig {

}
