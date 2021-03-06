package com.gempukku.swccgo.packagedProduct;

import com.gempukku.swccgo.game.CardCollection;
import com.gempukku.swccgo.game.SwccgCardBlueprintLibrary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Defines an Enhanced Premiere pack (Han With Heavy Blaster Pistol).
 */
public class EnhancedPremierePack_Han extends BasePackagedCardProduct {
    private List<String> _premiumCards = new ArrayList<String>();

    /**
     * Creates an Enhanced Premiere pack (Han With Heavy Blaster Pistol).
     * @param library the blueprint library
     */
    public EnhancedPremierePack_Han(SwccgCardBlueprintLibrary library) {
        super(library);
        _premiumCards.add("108_1");

        filterNonExistingCards(_premiumCards);
    }

    /**
     * Gets the name of the product.
     * @return the name of the product.
     */
    @Override
    public String getProductName() {
        return ProductName.ENHANCED_PREMIERE_PACK_HAN;
    }

    /**
     * Gets the price of the product.
     * @return the price of the product
     */
    @Override
    public float getProductPrice() {
        return ProductPrice.ENHANCED_PREMIERE_PACK;
    }

    /**
     * Opens the packaged card product.
     * @return the card collection items contained in the packaged card product.
     */
    @Override
    public List<CardCollection.Item> openPackage() {
        List<CardCollection.Item> result = new LinkedList<CardCollection.Item>();
        addCards(result, _premiumCards, false);
        addProducts(result, ProductName.PREMIERE_BOOSTER_PACK, 4);
        return result;
    }
}
