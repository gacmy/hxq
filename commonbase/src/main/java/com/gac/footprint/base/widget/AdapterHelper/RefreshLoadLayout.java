package com.gac.footprint.base.widget.AdapterHelper;

import android.support.v4.widget.SwipeRefreshLayout;

import com.gac.footprint.base.widget.AdapterHelper.BaseQuickAdapter;

import java.util.List;

/**
 * @描述：封装AdapterHelper
 * @file_name：com.gac.footprint.base.widget
 * @author：gac
 * @time：2018/6/20:17:59
 */

public class RefreshLoadLayout<T> {
    RefreshLoadListener listener;
    SwipeRefreshLayout refreshLayout;
    BaseQuickAdapter mAdapter;
    public RefreshLoadLayout(SwipeRefreshLayout refreshLayout, final BaseQuickAdapter adapter){
        this.refreshLayout = refreshLayout;
        mAdapter = adapter;
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                adapter.setEnableLoadMore(false);
                if(listener != null){
                    listener.refresh();
                }
            }
        });
        adapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                adapter.setEnableLoadMore(true);
                if(listener != null){
                    listener.onLoadMore();
                }
            }
        });
    }
    private void init(){

    }

    /**
     * 刷新数据
     * @param datas
     */
    public void refreshData(List<T> datas){
        mAdapter.setNewData(datas);
    }

    /**
     * 加载数据
     * @param datas
     */
    public void loadData(List<T> datas){
        mAdapter.addData(datas);
    }
    /**
     * 刷新完成
     */
    public void refreshFinish(){
        refreshLayout.setRefreshing(false);
        mAdapter.setEnableLoadMore(true);
    }

    /**
     * 加载完成
     */
    public void loadFinsih(){
        mAdapter.loadMoreComplete();
    }

    /**
     *加载 无数据
     */
    public void loadNoData(){
        mAdapter.loadMoreEnd();
    }

    /**
     * 加载失败
     */
    public void loadFail(){
        mAdapter.loadMoreFail();
    }

    public RefreshLoadLayout(SwipeRefreshLayout refreshLayout, BaseQuickAdapter adapter,boolean refresh,boolean load){
        refreshLayout.setEnabled(refresh);
        adapter.setEnableLoadMore(load);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if(listener != null){
                    listener.refresh();
                }
            }
        });
    }
    public void setListener(RefreshLoadListener listener){
        this.listener = listener;
    }
    public interface RefreshLoadListener{
        public void refresh();
        public void onLoadMore();
    }
}
