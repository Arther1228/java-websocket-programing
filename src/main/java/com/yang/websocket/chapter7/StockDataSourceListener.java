package com.yang.websocket.chapter7;

public interface StockDataSourceListener {
    
    public void handleNewStockData(PortfolioUpdate pu);
    
}
