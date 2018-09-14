package com.example.sivous.shixue.view.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ListView;
import android.widget.SimpleAdapter;
import com.etsy.android.grid.StaggeredGridView;
import com.example.sivous.shixue.Dao.ContentDao;
import com.example.sivous.shixue.Dao.DaoFactory;
import com.example.sivous.shixue.R;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.List;
import java.util.Map;

import static com.example.sivous.shixue.R.*;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ComFrag.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ComFrag#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ComFrag extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private SimpleAdapter simpleAdapter;
    private ListView listView;
    private ContentDao contentDao;

    public ComFrag() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ComFrag.
     */
    // TODO: Rename and change types and number of parameters
    public static ComFrag newInstance(String param1, String param2) {
        ComFrag fragment = new ComFrag();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the RefreshLayout for this fragment
        View view =  inflater.inflate(R.layout.fragment_fragment2, container, false);
        RefreshLayout refreshLayout = (RefreshLayout)view.findViewById(R.id.refreshLayout);
//        配置
        refreshLayout.setEnableLoadMore(true);//是否启用上拉加载功
        refreshLayout.setEnableAutoLoadMore(true);//是否启用列表惯性滑动到底部时自动加载更多
        refreshLayout.setEnableNestedScroll(true);//是否启用嵌套滚动
        refreshLayout.setDisableContentWhenLoading(true);//是否在加载的时候禁止列表的操作
        refreshLayout.setEnableScrollContentWhenLoaded(true);//是否在加载完成之后滚动内容显示新数据
        refreshLayout.setEnableFooterFollowWhenLoadFinished(true);//是否在全部加载结束之后Footer跟随内容
        refreshLayout.finishLoadMore(1);
        refreshLayout.autoLoadMore(1);
        refreshLayout.setFooterMaxDragRate(20);//最大显示下拉高度/Footer标准高度

//        模拟服务器拉取数据
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(RefreshLayout refreshlayout) {
                refreshlayout.finishRefresh(2000/*,false*/);//传入false表示刷新失败
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshlayout) {
                refreshlayout.finishLoadMore(2000/*,false*/);//传入false表示加载失败
            }
        });

//        sampleadapter,demo实例直接从dao取数据
        contentDao = DaoFactory.getDaoFactory().getImageDao();
        simpleAdapter = new SimpleAdapter(getContext(), (List<? extends Map<String, ?>>) contentDao.getTitleDes(),
                                                layout.com_content,
                                                new String[]{"title","description"},
                                                new int[]{id.comContentText,id.comContentDes});
//       添加到listview
        StaggeredGridView gridView = (StaggeredGridView) view.findViewById(R.id.grid_view);
        gridView.setAdapter(simpleAdapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
