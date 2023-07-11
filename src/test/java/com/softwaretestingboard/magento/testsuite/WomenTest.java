package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.Women;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class WomenTest extends BaseTest {

    Women women = new Women();

    @Test
    public void verifyTheSortByProductNameFilter() {
        women.mouseHoverOnWomenMenu();
        women.mouseHoverOnTops();
        women.clickOnJacket();
        women.selectSortByProductName();

    }
    @Test
    public void verifyTheSortByPriceFilter(){

        women.mouseHoverOnWomenMenu();
        women.mouseHoverOnTops();
        women.clickOnJacket();
        women.selectSortByPrice();




    }


}