package com.yang.websocket.chapter6;

public interface StockDataSourceListener {
    
    public void handleNewStockData(PortfolioUpdate pu);
    
}
