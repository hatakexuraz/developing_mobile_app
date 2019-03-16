package com.example.fabexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private LayoutInflater mIiflater;
    private final LinkedList<String> mWordList;

    public WordListAdapter(Context context, LinkedList<String> wordList){
        mIiflater = LayoutInflater.from(context); //convert xml format to java
        this.mWordList = wordList;
    }


    //convert "wordViewList" of xml format to java and return wordViewHolder
    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View mItemView = mIiflater.inflate(R.layout.wordlist_item, parent, false);
        return  new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder wordViewHolder, int i) {
        String mCurrent = mWordList.get(i);
        wordViewHolder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    class  WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public final TextView wordItemView;
        final WordListAdapter mAdapter;

        public WordViewHolder(@NonNull View itemView, WordListAdapter adapter) {
            super(itemView);
            wordItemView = itemView.findViewById(R.id.word);
            this.mAdapter = adapter;
        }

        @Override
        public void onClick(View v) {
            //Get the position of the item that was clicked
            int mPosition = getLayoutPosition();

            //Use that to access the affected item in mWorList
            String element = mWordList.get(mPosition);
            //change the word in the mWordList

            mWordList.set(mPosition, "Clicked!"+element);
            //Notify the adapter, that the data has changed so it can
            //update the RecyclerView to display the data
            mAdapter.notifyDataSetChanged();;
        }
    }
}
