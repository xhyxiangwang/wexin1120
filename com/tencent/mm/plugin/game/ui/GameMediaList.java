package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.an.a.a;
import com.tencent.mm.an.a.a.c.a;
import com.tencent.mm.an.n;
import com.tencent.mm.plugin.game.d.c;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public class GameMediaList
  extends LinearLayout
  implements View.OnClickListener
{
  String appId;
  int lFH;
  Context mContext;
  int mLA;
  private LinkedList<String> mNA;
  int mNz;
  
  public GameMediaList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(12698876116992L, 94614);
    this.appId = "";
    this.lFH = -1;
    this.mLA = 0;
    GMTrace.o(12698876116992L, 94614);
  }
  
  public final void S(LinkedList<a> paramLinkedList)
  {
    GMTrace.i(12699010334720L, 94615);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      setVisibility(8);
      GMTrace.o(12699010334720L, 94615);
      return;
    }
    this.mNA = new LinkedList();
    int i = 0;
    while (i < paramLinkedList.size())
    {
      localObject = (a)paramLinkedList.get(i);
      if ((!bg.mZ(((a)localObject).url)) && (((a)localObject).type == 0)) {
        this.mNA.add(((a)localObject).url);
      }
      i += 1;
    }
    removeAllViews();
    Object localObject = (LayoutInflater)getContext().getSystemService("layout_inflater");
    i = 0;
    while (i < paramLinkedList.size())
    {
      a locala = (a)paramLinkedList.get(i);
      if (!bg.mZ(locala.mNB))
      {
        View localView = ((LayoutInflater)localObject).inflate(this.mNz, this, false);
        ImageView localImageView = (ImageView)localView.findViewById(R.h.cbP);
        a locala1 = n.Ja();
        String str = locala.mNB;
        c.a locala2 = new c.a();
        locala2.hCO = true;
        locala1.a(str, localImageView, locala2.Jk());
        if (locala.type == 1) {
          localView.findViewById(R.h.cbL).setVisibility(0);
        }
        addView(localView);
        localImageView.setTag(locala);
        localImageView.setOnClickListener(this);
      }
      i += 1;
    }
    setVisibility(0);
    GMTrace.o(12699010334720L, 94615);
  }
  
  public void onClick(View paramView)
  {
    GMTrace.i(12699144552448L, 94616);
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      w.i("MicroMsg.GameMediaList", "Invalid tag");
      GMTrace.o(12699144552448L, 94616);
      return;
    }
    paramView = (a)paramView.getTag();
    switch (paramView.type)
    {
    }
    for (;;)
    {
      GMTrace.o(12699144552448L, 94616);
      return;
      c.aa(getContext(), paramView.url);
      ai.a(this.mContext, this.lFH, 1202, 1, 13, this.appId, this.mLA, null);
      GMTrace.o(12699144552448L, 94616);
      return;
      paramView = paramView.url;
      int j = this.mNA.indexOf(paramView);
      int i = j;
      if (j < 0) {
        i = 0;
      }
      paramView = new Intent(getContext(), GameGalleryUI.class);
      String[] arrayOfString = new String[this.mNA.size()];
      this.mNA.toArray(arrayOfString);
      paramView.putExtra("URLS", arrayOfString);
      paramView.putExtra("CURRENT", i);
      paramView.putExtra("REPORT_APPID", this.appId);
      paramView.putExtra("REPORT_SCENE", this.lFH);
      paramView.putExtra("SOURCE_SCENE", this.mLA);
      getContext().startActivity(paramView);
    }
  }
  
  public static final class a
  {
    public String mNB;
    public int type;
    public String url;
    
    public a()
    {
      GMTrace.i(12762226884608L, 95086);
      GMTrace.o(12762226884608L, 95086);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMediaList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */