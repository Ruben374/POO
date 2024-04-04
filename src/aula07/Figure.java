package aula07;

abstract class Figure {
    abstract double area();

    private String color;

    abstract double perimetro();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Figure other = (Figure) obj;
        return color.equals(other.color); // Comparando os atributos color

        // portanto o maximo que o equals retorna é verdadeiro se for a mesma referencia
        // ou se ambas forem objeto figure e tiverem a mesma cor
    }

}
