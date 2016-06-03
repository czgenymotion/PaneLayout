package draw.qianfeng.com.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Administrator on 2016/6/2 0002.
 */
public class Fragment2 extends Fragment{

    private static WebView webView;
    private String url;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.list_view,null);
        webView = (WebView) view.findViewById(R.id.web);
        return view;
    }



    public static void setWebView(String urlString){
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        WebViewClient client = new WebViewClient();
        webView.setWebViewClient(client);
        webView.loadUrl(urlString);
    }
}
