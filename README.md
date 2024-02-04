# Apriori Algorithm Implementation in Java

![Java](https://img.shields.io/badge/language-Java-orange.svg)

## Project Overview

This project is an implementation of the Apriori algorithm in Java, designed for association rule mining. The Apriori algorithm is a classic method for discovering frequent itemsets in a dataset, widely used in data mining and market analysis.

## Key Features

- Identifies frequent itemsets and association rules based on input dataset.
- Flexible parameter settings, including support and confidence thresholds.
- Customizable output format for easy result interpretation and usage.

## How to Use

1. Clone the project locally:

```bash
git clone https://github.com/yourusername/apriori-java.git
```

## Example
```bash
1. {Bread, Milk}
2. {Bread, Egg, Flour}
3. {Egg, Flour}
4. {Bread, Milk, Egg, Flour}
5. {Bread, Milk, Egg}
```
```bash
Frequent Itemsets:
{Bread}: 4
{Egg}: 3
{Milk}: 3
{Flour}: 3
{Bread, Milk}: 3
{Egg, Flour}: 3
{Bread, Egg}: 2
{Milk, Egg}: 2

Association Rules:
{Bread} -> {Milk}: 0.75
{Bread} -> {Egg}: 0.5
{Egg} -> {Flour}: 1.0
{Bread, Egg} -> {Flour}: 1.0
{Flour} -> {Egg}: 1.0
{Egg, Flour} -> {Bread}: 1.0
{Egg} -> {Bread}: 0.67
{Flour} -> {Egg}: 1.0
{Egg} -> {Bread}: 0.67
{Bread, Milk} -> {Egg}: 1.0
{Egg} -> {Bread, Milk}: 0.67
{Bread} -> {Egg, Milk}: 0.5
{Egg} -> {Bread, Milk}: 0.67
```
