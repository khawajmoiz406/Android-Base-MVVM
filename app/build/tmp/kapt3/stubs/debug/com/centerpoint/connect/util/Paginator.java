package com.centerpoint.connect.util;

import java.lang.System;

/**
 * @author Salman Aziz
 * created on 2/22/21
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\u0010\u000bJ \u0010\u0012\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016R\u001a\u0010\f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/centerpoint/connect/util/Paginator;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "isLoading", "Lkotlin/Function0;", "", "loadMore", "Lkotlin/Function1;", "", "", "(Landroidx/recyclerview/widget/RecyclerView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "currentPage", "getCurrentPage", "()I", "setCurrentPage", "(I)V", "loading", "onScrolled", "dx", "dy", "app_debug"})
public final class Paginator extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> isLoading = null;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> loadMore = null;
    private int currentPage = 0;
    private boolean loading;
    
    public Paginator(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<java.lang.Boolean> isLoading, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> loadMore) {
        super();
    }
    
    public final int getCurrentPage() {
        return 0;
    }
    
    public final void setCurrentPage(int p0) {
    }
    
    @java.lang.Override()
    public void onScrolled(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, int dx, int dy) {
    }
}