package draw.qianfeng.com.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class Fragment1 extends ListFragment{
    private OnTitleItemClickListener listener;

    public interface OnTitleItemClickListener{
        void onTitleItemClick(int position);
    }

    public void setOnTitleItemClickListener(OnTitleItemClickListener listener) {
        this.listener = listener;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        String[] content = {"网易", "百度", "搜狐"};
        ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, content);
        setListAdapter(adapter);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        //就让管理该Fragment的Activity作为回调对象
        setOnTitleItemClickListener((OnTitleItemClickListener) getActivity());
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id){
        if (listener != null)
        {
            listener.onTitleItemClick(position);
        }
    }
}
