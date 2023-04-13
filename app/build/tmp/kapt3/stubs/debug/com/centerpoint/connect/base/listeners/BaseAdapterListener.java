package com.centerpoint.connect.base.listeners;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/centerpoint/connect/base/listeners/BaseAdapterListener;", "", "isLoading", "", "onItemClick", "", "position", "", "item", "onLoadMore", "pageNo", "app_debug"})
public abstract interface BaseAdapterListener {
    
    public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
    java.lang.Object item);
    
    public abstract void onLoadMore(int pageNo);
    
    public abstract boolean isLoading();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void onLoadMore(@org.jetbrains.annotations.NotNull()
        com.centerpoint.connect.base.listeners.BaseAdapterListener $this, int pageNo) {
        }
        
        public static boolean isLoading(@org.jetbrains.annotations.NotNull()
        com.centerpoint.connect.base.listeners.BaseAdapterListener $this) {
            return false;
        }
    }
}