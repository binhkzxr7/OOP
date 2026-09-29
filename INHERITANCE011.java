import java.util.*;

class Asset {
    protected String name;
    protected double value;
    
    public Asset(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }
    public double getValue() {
        return value;
    }
    public double getDepreciation() {
        return value;
    }
}

class FixedAsset extends Asset {
    private int usefulLife;

    public FixedAsset(String name, double value, int usefulLife) {
        super(name,value);
        this.usefulLife = usefulLife;
    }

    public double getDepreciation() {
        return value/usefulLife;
    }
}

class CurrentAsset extends Asset {
    private double liquidationValue;

    public CurrentAsset(String name, double value, double liquidationValue) {
        super(name, value);
        this.liquidationValue = liquidationValue;
    }

    public double getDepreciation() {
        return value * 0.1;
    }
}

class IntangibleAsset extends Asset {
    private int amortizationPeriod;

    public IntangibleAsset(String name, double value, int amortizationPeriod) {
        super(name, value);
        this.amortizationPeriod = amortizationPeriod;
    }

    public double getDepreciation() {
        return value/amortizationPeriod;
    }
}

class AssetManager {
    private List<Asset> assets;

    public AssetManager() {
        assets = new ArrayList<>();
    }

    public void addAsset(Asset asset) {
        assets.add(asset);
    }

    public double getTotalValue() {
        double total = 0;
        for (Asset asset: assets) {
            total += asset.getValue();
        }
        return total;
    }

    public double getTotalDepreciation() {
        double total = 0;
        for (Asset asset : assets) {
            total += asset.getDepreciation();
        }
        return total;
    }

    public List<Asset> getAssets() {
        return assets;
    }
}

public class INHERITANCE011 {
    public static void main(String[] arrgs) {
        Scanner sc = new Scanner(System.in);
        AssetManager manager = new AssetManager();
        int t = sc.nextInt();
        while(t-->0) {
            String type = sc.next();
            String name = sc.next();
            double value = sc.nextDouble();
            if (type.equals("FixedAsset")) {
                int usefulLife = sc.nextInt();
                manager.addAsset(new FixedAsset(name, value, usefulLife));
            }
            else if (type.equals("CurrentAsset")) {
                double liquidationValue = sc.nextDouble();
                manager.addAsset(new CurrentAsset(name, value, liquidationValue));
            }
            else if (type.equals("IntangibleAsset")) {
                int amortizationPeriod = sc.nextInt();
                manager.addAsset(new IntangibleAsset(name, value, amortizationPeriod));
            }
        }
        for (Asset asset : manager.getAssets()) {
            System.out.println("Asset Name: " + asset.getName());
            System.out.printf("Asset Value: %.1f\n", asset.getValue());
            System.out.printf("Depreciation: %.1f\n", asset.getDepreciation());
            System.out.println("---------------------------");
        }
        System.out.printf("Total Value of Assets: %.1f\n", manager.getTotalValue());
        System.out.printf("Total Depreciation of Assets: %.1f\n", manager.getTotalDepreciation());
        sc.close();
    }
}