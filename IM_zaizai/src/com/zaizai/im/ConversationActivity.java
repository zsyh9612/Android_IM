package com.zaizai.im;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class ConversationActivity extends Activity{
	
	private ListView listViewConversationList;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.conversation);
		
		listViewConversationList=(ListView)findViewById(R.id.listViewConversationList);
		ArrayList<ConversationListInfo> dataList = new ArrayList<ConversationListInfo>();
		
		dataList.add(new ConversationListInfo(R.drawable.ic_launcher, "Hello World!!!!!这是第一条信息",false));
		dataList.add(new ConversationListInfo(R.drawable.ic_launcher, "这是第二条信息",true));
		dataList.add(new ConversationListInfo(R.drawable.ic_launcher, "这是第三条信息",false));
		listViewConversationList.setAdapter(new ConversationListAdapter(this, dataList));
		
	}

	
	
	 public class ConversationListInfo {
	        private int list_img;
	        private String list_text;
	        private Boolean isme;

	        public ConversationListInfo(int list_img,String list_text,Boolean isme) {
	            this.list_img = list_img;
	            this.list_text = list_text;
	            this.isme=isme;

	        }
	        public int getList_img() {
	            return list_img;
	        }

	       
	        public String getList_text() {
	            return list_text;
	        }
	        
	        public Boolean getList_isme() {
	            return isme;
	        }
	  
	    }
	 
	 public class ConversationListAdapter extends BaseAdapter{

		 private ArrayList<ConversationListInfo> dataList;
		    private LayoutInflater layoutInflater;
		    private Context context;
		    
		    public ConversationListAdapter(Context context,ArrayList<ConversationListInfo> dataList) {//构造函数
		    	this.context=context;
				this.dataList = dataList;
				this.layoutInflater=LayoutInflater.from(context);//从xml中找出对应的控件并实例化
			}
		    
		  	public final class ViewHolder{//内部类，用于控件缓存
	    		public ImageView imageView;
	    		public TextView textViewText;

	    	}
		  	

			@Override
			public int getCount() {
				
				return dataList.size();
			}

			@Override
			public Object getItem(int position) {
				
				return dataList.get(position);
			}

			@Override
			public long getItemId(int position) {
				
				return position;
			}

			@Override
			public View getView(int position, View convertView, ViewGroup parent) {
				
				ViewHolder viewHolder=null;
				ConversationListInfo conversationListInfo = dataList.get(position);
	    		if(convertView==null){
	    			viewHolder=new ViewHolder();
	    			//获得组件，实例化组件
	    			
	    			
	    			//根据是否是我，选择性地加载两套布局
	    			if(conversationListInfo.getList_isme())
	    			{
	    				
	    				convertView=layoutInflater.inflate(R.layout.conversation_listitem_right, null);
	    			}
	    			else
	    			{
	    				
	    				convertView=layoutInflater.inflate(R.layout.conversation_listitem_left, null);
	    			}
	    			
	    			
	    			viewHolder.imageView=(ImageView)convertView.findViewById(R.id.imageView);
	    			viewHolder.textViewText=(TextView)convertView.findViewById(R.id.textViewText);
	 
	    			convertView.setTag(viewHolder);
	    		}else{
	    			viewHolder=(ViewHolder)convertView.getTag();
	    		}
	    		//绑定数据
	    		
	    		viewHolder.imageView.setImageResource(conversationListInfo.getList_img());
	    		viewHolder.textViewText.setText(conversationListInfo.getList_text());

	    		return convertView;
			}
		 
		 
		 
	 }
	 
	 
}
