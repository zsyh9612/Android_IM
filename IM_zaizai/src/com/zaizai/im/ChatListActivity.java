package com.zaizai.im;



import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ChatListActivity extends Activity{
	
	 private ListView listViewChatList;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {  
	            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);  
	            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);  
	        }//沉浸式状态栏
		setContentView(R.layout.chatlist);
		
		listViewChatList=(ListView)findViewById(R.id.listViewChatList);
		listViewChatList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(ChatListActivity.this, ConversationActivity.class);
				startActivity(intent);
			}
		});
		
		
		
		ArrayList<ChatListInfo> dataList = new ArrayList<ChatListInfo>();
		
		//坑：add方法传入的是引用，只能采用new匿名对象的方法
		dataList.add(new ChatListInfo(R.drawable.ic_launcher,"OurEDA聊天","15-张单旸晖：掌门要放大招了","昨天"));
		dataList.add(new ChatListInfo(R.drawable.ic_launcher, "OurEDA_Maker_2015", "24小时全年无休看人搬砖:[图片]", "昨天"));
		listViewChatList.setAdapter(new ChatListAdapter(this, dataList));
		
		
		
		
	}
	
	
	
	 public class ChatListInfo {
	        private int list_img;
	        private String list_title;
	        private String list_message;
	        private String list_time;
	        

	        public ChatListInfo(int list_img, String list_title,String list_message, String list_time) {
	            this.list_img = list_img;
	            this.list_title = list_title;
	            this.list_message=list_message;
	            this.list_time = list_time;
	        }

	
	        
	        public int getList_img() {
	            return list_img;
	        }

	        public String getList_title() {
	            return list_title;
	        }

	        public String getList_message() {
	            return list_message;
	        }
	        
	        public String getList_time() {
	            return list_time;
	        }
	  
	    }
	 
	 
	 
	 
	 public class ChatListAdapter extends BaseAdapter{
		

		private ArrayList<ChatListInfo> dataList;
	    private LayoutInflater layoutInflater;
	    private Context context;
	    
	    public ChatListAdapter(Context context,ArrayList<ChatListInfo> dataList) {//构造函数
	    	this.context=context;
			this.dataList = dataList;
			this.layoutInflater=LayoutInflater.from(context);//从xml中找出对应的控件并实例化
		}
	    
	  	public final class ViewHolder{//内部类，用于控件缓存
    		public ImageView imageView;
    		public TextView textViewTitle;
    		public TextView textViewMessage;
    		public TextView textViewTime;
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
    		if(convertView==null){
    			viewHolder=new ViewHolder();
    			//获得组件，实例化组件
    			convertView=layoutInflater.inflate(R.layout.chatlist_item, null);
    			viewHolder.imageView=(ImageView)convertView.findViewById(R.id.imageView);
    			viewHolder.textViewTitle=(TextView)convertView.findViewById(R.id.textViewTitle);
    			viewHolder.textViewMessage=(TextView)convertView.findViewById(R.id.textViewMessage);
    			viewHolder.textViewTime=(TextView)convertView.findViewById(R.id.textViewTime);
    			convertView.setTag(viewHolder);
    		}else{
    			viewHolder=(ViewHolder)convertView.getTag();
    		}
    		//绑定数据
    		ChatListInfo chatListInfo = dataList.get(position);
    		viewHolder.imageView.setImageResource(chatListInfo.getList_img());
    		viewHolder.textViewTitle.setText(chatListInfo.getList_title());
    		viewHolder.textViewMessage.setText(chatListInfo.getList_message());
    		viewHolder.textViewTime.setText(chatListInfo.getList_time());

    		return convertView;
		}
		 
		 
	 }
	
	
}
