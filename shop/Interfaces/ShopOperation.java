package Interfaces;
import Classes.*;

public interface ShopOperation
{
    void insertShop(Shop s);
    void removeShop(Shop s);
    Shop getShop(String sid);
    void showAllShops();
}
