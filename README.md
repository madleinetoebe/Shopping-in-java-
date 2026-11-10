# Shopping (Java)

A shopping mall system written in Java to practice **object-oriented programming**: classes, encapsulation, overloaded constructors, inheritance, polymorphism and arrays of objects.

Course project for Laboratory I (Unisinos).

## What the system models

A `Shopping` has an address and a set of stores. Each `Loja` (store) has employees, an address, a founding date and a stock of products.

```
Shopping ── has many ──> Loja ── has many ──> Produto
                          │
                          ├── Alimentacao   (food: permit date)
                          ├── Bijuteria     (jewelry: sales target)
                          ├── Cosmetico     (cosmetics: sales fee)
                          ├── Informatica   (electronics: equipment insurance)
                          └── Vestuario     (clothing: imported products or not)

Endereco (address) and Data (date) are used by Shopping, Loja and Produto.
```

The class and method names are in Portuguese, as required by the course.

## Classes

| Class | Role |
| --- | --- |
| `Shopping` | Keeps the stores in an array. Adds and removes stores, counts stores by type and finds the electronics store with the highest insurance. |
| `Loja` | Base class. Calculates salary costs, classifies the store size, and adds, removes and lists products. Has three constructors. |
| `Alimentacao`, `Bijuteria`, `Cosmetico`, `Informatica`, `Vestuario` | Store types that extend `Loja` and add one attribute of their own. |
| `Produto` | Name, price and expiration date. |
| `Endereco` | Street, number, complement, city, state, country and postal code. |
| `Data` | Day, month and year, with validation (including the number of days in each month). |

## How to compile

Requires the JDK. From the project folder:

```
javac -d out src/*.java
```

The `.class` files are written to the `out` folder. The project contains only the model classes and has no `main` class, so to see everything working you need to write a small test class that creates a `Shopping` and a few stores.

## What I practiced

- Splitting a problem into classes with clear responsibilities
- Inheritance and `instanceof` to handle different types of stores
- Validating data inside the class itself (`Data`)
- Working with arrays of objects
