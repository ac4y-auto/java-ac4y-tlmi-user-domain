# java-ac4y-tlmi-user-domain

TLMI translate user domain object with algebra layer and JPA persistence support.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-tlmi-user-domain`
- **Version**: `1.0.0`

## Description

Domain layer for TLMI translate users. Contains the `TlmiTranslateUser` entity and its algebra base class with fields for user identification, name, and password.

### Key Classes

- `TlmiTranslateUser` - Translate user domain object (JPA entity)
- `TlmiTranslateUserAlgebra` - Algebra base class with fields and getters/setters

## Dependencies

- `ac4y-base4jsonandxml` (JSON/XML serialization)
- `javax.persistence` (JPA, provided)

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJTlmiModule/IJTlmiUserDomain`.
