# Architektura - java-ac4y-tlmi-user-domain

## Attekintes

TLMI fordito felhasznalo domain objektum algebra reteggel es JPA perzisztencia tamogatassal.

## Szerkezet

```
src/main/java/tlmi/user/
  algebra/
    TlmiTranslateUserAlgebra.java       - Algebra bazis osztaly (mezok, getter/setter)
  domain/
    TlmiTranslateUser.java              - Fordito felhasznalo domain objektum (JPA entity)
```

## Fuggosegek

- ac4y-base4jsonandxml (JSON/XML szerializacio)
- javax.persistence (JPA, provided)

## Eredet

Az `IJTlmiModule/IJTlmiUserDomain` modulbol kinyerve.
