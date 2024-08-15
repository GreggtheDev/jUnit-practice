package com.org.example;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for the IOU class.
 */
public class IOUTest {

    /**
     * Tests setting and retrieving a debt for a single person.
     */
    @Test
    public void testSetAndRetrieveDebt() {
        IOU iou = new IOU();
        iou.setSum("Alice", 100.0);
        assertEquals(100.0, iou.howMuchDoIOweTo("Alice"), 0.01);
    }

    /**
     * Tests retrieving a debt when no amount has been set (should return 0.0).
     */
    @Test
    public void testRetrieveDebtForNonExistentPerson() {
        IOU iou = new IOU();
        assertEquals(0.0, iou.howMuchDoIOweTo("Bob"), 0.01);
    }

    /**
     * Tests overwriting a debt for a person and retrieving the updated amount.
     */
    @Test
    public void testOverwriteDebt() {
        IOU iou = new IOU();
        iou.setSum("Charlie", 50.0);
        iou.setSum("Charlie", 75.0);
        assertEquals(75.0, iou.howMuchDoIOweTo("Charlie"), 0.01);
    }

    /**
     * Tests setting and retrieving debts for multiple people.
     */
    @Test
    public void testMultipleDebts() {
        IOU iou = new IOU();
        iou.setSum("David", 20.0);
        iou.setSum("Eve", 35.5);
        assertEquals(20.0, iou.howMuchDoIOweTo("David"), 0.01);
        assertEquals(35.5, iou.howMuchDoIOweTo("Eve"), 0.01);
    }

    /**
     * Tests the edge case where a debt is set to zero.
     */
    @Test
    public void testSetZeroDebt() {
        IOU iou = new IOU();
        iou.setSum("Frank", 0.0);
        assertEquals(0.0, iou.howMuchDoIOweTo("Fran
