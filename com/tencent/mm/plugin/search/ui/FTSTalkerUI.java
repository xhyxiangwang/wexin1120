package com.tencent.mm.plugin.search.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.fts.widget.FTSEditTextView;
import com.tencent.mm.ui.fts.widget.FTSEditTextView.b;
import com.tencent.mm.ui.fts.widget.a;
import com.tencent.mm.ui.fts.widget.a.b;
import com.tencent.mm.x.n;
import java.util.ArrayList;
import java.util.List;

public class FTSTalkerUI
  extends FTSBaseUI
{
  private String fAJ;
  private String fIW;
  private int mmQ;
  private h pns;
  
  public FTSTalkerUI()
  {
    GMTrace.i(11843774971904L, 88243);
    GMTrace.o(11843774971904L, 88243);
  }
  
  protected final b a(c paramc)
  {
    GMTrace.i(16488513667072L, 122849);
    if (this.pns == null) {
      this.pns = new h(paramc, this.fAJ, this.mmQ);
    }
    paramc = this.pns;
    GMTrace.o(16488513667072L, 122849);
    return paramc;
  }
  
  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    GMTrace.i(18362193149952L, 136809);
    super.a(paramString2, paramString2, paramList, paramb);
    GMTrace.o(18362193149952L, 136809);
  }
  
  public final boolean aaj()
  {
    GMTrace.i(16488647884800L, 122850);
    GMTrace.o(16488647884800L, 122850);
    return false;
  }
  
  protected final void bbX()
  {
    GMTrace.i(16488379449344L, 122848);
    super.bbX();
    this.fAJ = getIntent().getStringExtra("key_talker");
    this.fIW = getIntent().getStringExtra("key_query");
    this.mmQ = getIntent().getIntExtra("Search_Scene", 0);
    GMTrace.o(16488379449344L, 122848);
  }
  
  public final String getHint()
  {
    GMTrace.i(16488782102528L, 122851);
    String str = getString(R.l.eES);
    GMTrace.o(16488782102528L, 122851);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(11844043407360L, 88245);
    int i = R.i.cVu;
    GMTrace.o(11844043407360L, 88245);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(11843909189632L, 88244);
    super.onCreate(paramBundle);
    Object localObject = new a();
    ((a)localObject).gEW = n.fc(this.fAJ);
    paramBundle = new ArrayList();
    paramBundle.add(localObject);
    localObject = this.fIW;
    this.fIW = ((String)localObject);
    this.pmg.wGw.r((String)localObject, paramBundle);
    bbS();
    GMTrace.o(11843909189632L, 88244);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(11844311842816L, 88247);
    this.pns.finish();
    super.onDestroy();
    GMTrace.o(11844311842816L, 88247);
  }
  
  private final class a
    implements a.b
  {
    public String gEW;
    
    public a()
    {
      GMTrace.i(18361253625856L, 136802);
      GMTrace.o(18361253625856L, 136802);
    }
    
    public final int compareTo(Object paramObject)
    {
      GMTrace.i(18361522061312L, 136804);
      GMTrace.o(18361522061312L, 136804);
      return 0;
    }
    
    public final String getTagName()
    {
      GMTrace.i(18361387843584L, 136803);
      String str = this.gEW;
      GMTrace.o(18361387843584L, 136803);
      return str;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/search/ui/FTSTalkerUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */