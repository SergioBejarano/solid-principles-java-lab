package com.example.solid.srp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    @Test
    void testCalculateTotal() {
        Invoice invoice = new Invoice("Cliente1", 100.0);
        assertEquals(121.0, invoice.calculateTotal(), 0.001);
    }

    @Test
    void testPrinterOutput() {
        Invoice invoice = new Invoice("Cliente2", 200.0);
        InvoicePrinter printer = new InvoicePrinter();
        // No assertion, just ensure no exception
        printer.print(invoice);
    }

    @Test
    void testRepositorySave() {
        Invoice invoice = new Invoice("Cliente3", 300.0);
        InvoiceRepository repo = new InvoiceRepository();
        // No assertion, just ensure no exception
        repo.save(invoice);
    }
}
