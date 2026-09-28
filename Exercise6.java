
class InventoryService {
    void updateStock() {
        System.out.println("Stock updated");
    }
}

class ProductionMaterialPlanner {
    void calculateMaterialNeeds() {

        System.out.println("Material requirements calculated");
    }
}

class InvoiceService {
    void createInvoice() {
        System.out.println("Invoice created");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        InventoryService inventory = new InventoryService();
        ProductionMaterialPlanner planner = new ProductionMaterialPlanner();
        InvoiceService invoice = new InvoiceService();

        inventory.updateStock();
        planner.calculateMaterialNeeds();
        invoice.createInvoice();
    }
}