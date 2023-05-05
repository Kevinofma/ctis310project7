package edu.guilford;

public class Water implements Comparable<Water>{

    private String name;
    private String formula;
    private double mass;
    private double moles;

    public Water(double moles) {
        this.name = "Water";
        this.formula = "H2O";
        this.mass = calculateMass(formula);
        this.moles = moles;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public String getFormula() {
        return formula;
    }

    public double getMass() {
        return mass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public double getMoles() {
        return moles;
    }

    public void setMoles(double moles) {
        this.moles = moles;
    }

    //use the calculateMass method from Molecules to calculate the mass of water and then multiply it by the number of molecules
    public double calculateTotalMass(double moles) {
        double mass = calculateMass(formula);
        mass = mass * moles;
        return mass;
    }
    
    // Method that calculates the mass of a molecule from its formula, problem is that due to how it is coded. EX: molecules such as CH3OH need to be inputed as CH4O
    // molecules with double digit amounts of a certain atom also break the code EX: C10H20O10
    public double calculateMass(String formula) {
        double Cmass = 0;
        double Hmass = 0;
        double Omass = 0;
        double Nmass = 0;
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == 'C') {
                Cmass = Cmass + 12.011;
            } else if (formula.charAt(i) == 'H') {
                Hmass = Hmass + 1.008;
            } else if (formula.charAt(i) == 'O') {
                Omass = Omass + 15.999;
            } else if (formula.charAt(i) == 'N') {
                Nmass = Nmass + 14.007;
            } else if (Character.isDigit(formula.charAt(i))) {
                if (formula.charAt(i - 1) == 'C') {
                    Cmass = Cmass * Character.getNumericValue(formula.charAt(i));
                }
                if (formula.charAt(i - 1) == 'H') {
                    Hmass = Hmass * Character.getNumericValue(formula.charAt(i));
                }
                if (formula.charAt(i - 1) == 'O') {
                    Omass = Omass * Character.getNumericValue(formula.charAt(i));
                }
                if (formula.charAt(i - 1) == 'N') {
                    Nmass = Nmass * Character.getNumericValue(formula.charAt(i));
                }
            } else {
                System.out.println("Invalid formula. Please try again.");
            }
        }
        mass = Cmass + Hmass + Omass + Nmass;
        return mass;
    }

    @Override
    public int compareTo(Water other) {
        // sort the water molecules by the number of moles
        if (this.moles > other.moles) {
            return 1;
        } else if (this.moles < other.moles) {
            return -1;
        } else {
            return 0;
        }        
    }
}
