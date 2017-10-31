package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.c;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CompressPreviewUI
  extends MMActivity
{
  private ProgressBar jOP;
  private TextView mnQ;
  private String oEO;
  private String oFC;
  private c oHA;
  private String oHb;
  private long oIr;
  private List<a> oIs;
  private String oIt;
  private ListView oIu;
  private b oIv;
  private p.a oIw;
  
  public CompressPreviewUI()
  {
    GMTrace.i(5548024004608L, 41336);
    this.oEO = null;
    this.oFC = null;
    this.oIr = 0L;
    this.oHA = new c(this);
    this.oIs = new ArrayList();
    this.oIw = new p.a()
    {
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5503597936640L, 41005);
        if (paramAnonymousInt == -5)
        {
          CompressPreviewUI.j(CompressPreviewUI.this).a(new c.a()
          {
            public final void aXd()
            {
              GMTrace.i(5511919435776L, 41067);
              CompressPreviewUI.i(CompressPreviewUI.this);
              GMTrace.o(5511919435776L, 41067);
            }
            
            public final void aXe()
            {
              GMTrace.i(5512053653504L, 41068);
              GMTrace.o(5512053653504L, 41068);
            }
          });
          GMTrace.o(5503597936640L, 41005);
          return;
        }
        CompressPreviewUI.k(CompressPreviewUI.this).setVisibility(8);
        CompressPreviewUI.l(CompressPreviewUI.this).setVisibility(0);
        CompressPreviewUI.d(CompressPreviewUI.this).setVisibility(8);
        GMTrace.o(5503597936640L, 41005);
      }
      
      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(5503463718912L, 41004);
        CompressPreviewUI.b(CompressPreviewUI.this, (String)paramAnonymousMap.get(".Response.result.compressfilepath"));
        int j = bg.getInt((String)paramAnonymousMap.get(".Response.result.filelist.count"), 0);
        int i = 0;
        if (i < j) {}
        for (;;)
        {
          try
          {
            Object localObject = new StringBuilder(".Response.result.filelist.list.item");
            if (i <= 0) {
              break label411;
            }
            paramAnonymousString = Integer.valueOf(i);
            paramAnonymousString = paramAnonymousString;
            localObject = (String)paramAnonymousMap.get(paramAnonymousString + ".path");
            if (localObject == null) {
              break label404;
            }
            localObject = URLDecoder.decode((String)localObject, "utf-8");
            String str1 = (String)paramAnonymousMap.get(paramAnonymousString + ".parentpath");
            int k = bg.getInt((String)paramAnonymousMap.get(paramAnonymousString + ".size"), 0);
            int m = bg.getInt((String)paramAnonymousMap.get(paramAnonymousString + ".type"), 0);
            boolean bool = ((String)paramAnonymousMap.get(paramAnonymousString + ".preview")).equals("1");
            String str2 = (String)paramAnonymousMap.get(paramAnonymousString + ".name");
            List localList = CompressPreviewUI.h(CompressPreviewUI.this);
            CompressPreviewUI localCompressPreviewUI = CompressPreviewUI.this;
            if (k == 0)
            {
              paramAnonymousString = "";
              localList.add(new CompressPreviewUI.a(localCompressPreviewUI, (String)localObject, str2, str1, m, paramAnonymousString, bool));
              break label404;
            }
            paramAnonymousString = "(" + bg.aD(k) + ")";
            continue;
            CompressPreviewUI.a(CompressPreviewUI.this, "");
          }
          catch (Exception paramAnonymousString)
          {
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.CompressPreviewUI", paramAnonymousString, "", new Object[0]);
          }
          GMTrace.o(5503463718912L, 41004);
          return;
          label404:
          i += 1;
          break;
          label411:
          paramAnonymousString = "";
        }
      }
    };
    GMTrace.o(5548024004608L, 41336);
  }
  
  private void Eo(String paramString)
  {
    GMTrace.i(5548829310976L, 41342);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.CompressPreviewUI", "curPath=" + paramString);
    this.jOP.setVisibility(8);
    this.mnQ.setVisibility(8);
    this.oIu.setVisibility(0);
    a locala1 = Ep(paramString);
    ArrayList localArrayList = new ArrayList();
    if (locala1 != null) {
      localArrayList.add(locala1);
    }
    int i = 0;
    while (i < this.oIs.size())
    {
      a locala2 = (a)this.oIs.get(i);
      if (((paramString.endsWith(locala2.oIz)) && (locala2.oIz.length() > 0)) || (locala2.oIz.equals(paramString))) {
        localArrayList.add(locala2);
      }
      i += 1;
    }
    paramString = this.oIv;
    paramString.oIC = locala1;
    paramString.oID = localArrayList;
    this.oIv.notifyDataSetChanged();
    this.oIu.setSelection(0);
    GMTrace.o(5548829310976L, 41342);
  }
  
  private a Ep(String paramString)
  {
    GMTrace.i(5548963528704L, 41343);
    Iterator localIterator = this.oIs.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.id.equals(paramString))
      {
        GMTrace.o(5548963528704L, 41343);
        return locala;
      }
    }
    GMTrace.o(5548963528704L, 41343);
    return null;
  }
  
  private void aXs()
  {
    GMTrace.i(5549097746432L, 41344);
    HashMap localHashMap = new HashMap();
    localHashMap.put("mailid", this.oEO);
    localHashMap.put("attachid", this.oFC);
    localHashMap.put("fun", "list");
    com.tencent.mm.plugin.qqmail.b.p localp = com.tencent.mm.plugin.qqmail.b.w.aXa();
    p.a locala = this.oIw;
    localp.a("/cgi-bin/viewcompress", localHashMap, new p.c(), locala);
    GMTrace.o(5549097746432L, 41344);
  }
  
  protected final void MH()
  {
    GMTrace.i(5548426657792L, 41339);
    this.oIu = ((ListView)findViewById(R.h.bwW));
    this.mnQ = ((TextView)findViewById(R.h.bwU));
    this.jOP = ((ProgressBar)findViewById(R.h.bwV));
    if ((this.oEO == null) || (this.oFC == null))
    {
      this.jOP.setVisibility(8);
      this.mnQ.setText(R.l.emO);
      GMTrace.o(5548426657792L, 41339);
      return;
    }
    this.oIv = new b((byte)0);
    this.oIu.setAdapter(this.oIv);
    this.oIu.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(5542923730944L, 41298);
        paramAnonymousView = CompressPreviewUI.a(CompressPreviewUI.this).sG(paramAnonymousInt);
        String str1 = paramAnonymousView.id;
        paramAnonymousAdapterView = CompressPreviewUI.a(CompressPreviewUI.this);
        if (paramAnonymousAdapterView.oIC == null) {}
        for (paramAnonymousAdapterView = null; str1.equals(paramAnonymousAdapterView); paramAnonymousAdapterView = paramAnonymousAdapterView.oIC.id)
        {
          CompressPreviewUI.a(CompressPreviewUI.this, CompressPreviewUI.a(CompressPreviewUI.this).aXu());
          GMTrace.o(5542923730944L, 41298);
          return;
        }
        if (paramAnonymousView.aXt())
        {
          CompressPreviewUI.a(CompressPreviewUI.this, paramAnonymousView.id);
          GMTrace.o(5542923730944L, 41298);
          return;
        }
        if (paramAnonymousView.oIB)
        {
          paramAnonymousAdapterView = "mailid=" + CompressPreviewUI.b(CompressPreviewUI.this);
          str1 = "attachid=" + paramAnonymousView.id;
          String str2 = "compressfilepath=" + CompressPreviewUI.c(CompressPreviewUI.this);
          Intent localIntent = new Intent(CompressPreviewUI.this, MailWebViewUI.class);
          localIntent.putExtra("uri", "/cgi-bin/viewdocument");
          localIntent.putExtra("params", new String[] { paramAnonymousAdapterView, str1, str2, "texttype=html" });
          localIntent.putExtra("baseurl", com.tencent.mm.plugin.qqmail.b.p.aWV());
          localIntent.putExtra("method", "get");
          localIntent.putExtra("singleColumn", FileExplorerUI.ON(paramAnonymousView.name));
          localIntent.putExtra("title", CompressPreviewUI.this.getString(R.l.ewJ));
          CompressPreviewUI.this.startActivity(localIntent);
        }
        GMTrace.o(5542923730944L, 41298);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5511382564864L, 41063);
        CompressPreviewUI.this.onKeyDown(4, null);
        GMTrace.o(5511382564864L, 41063);
        return true;
      }
    });
    new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5536883933184L, 41253);
        BackwardSupportUtil.c.a(CompressPreviewUI.d(CompressPreviewUI.this));
        GMTrace.o(5536883933184L, 41253);
      }
    };
    a(0, getString(R.l.dvb), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5501584670720L, 40990);
        paramAnonymousMenuItem = new Intent(CompressPreviewUI.this, AttachDownloadPage.class);
        paramAnonymousMenuItem.putExtra("attach_name", CompressPreviewUI.e(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("mail_id", CompressPreviewUI.b(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("attach_id", CompressPreviewUI.f(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("total_size", CompressPreviewUI.g(CompressPreviewUI.this));
        paramAnonymousMenuItem.putExtra("is_preview", 0);
        paramAnonymousMenuItem.putExtra("is_compress", true);
        CompressPreviewUI.this.startActivity(paramAnonymousMenuItem);
        GMTrace.o(5501584670720L, 40990);
        return true;
      }
    });
    aXs();
    GMTrace.o(5548426657792L, 41339);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5548158222336L, 41337);
    int i = R.i.cZp;
    GMTrace.o(5548158222336L, 41337);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5548292440064L, 41338);
    super.onCreate(paramBundle);
    this.oEO = getIntent().getStringExtra("mail_id");
    this.oFC = getIntent().getStringExtra("attach_id");
    this.oIr = getIntent().getLongExtra("attach_size", 0L);
    this.oHb = getIntent().getStringExtra("attach_name");
    MH();
    rV(this.oHb);
    GMTrace.o(5548292440064L, 41338);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5548560875520L, 41340);
    super.onDestroy();
    this.oHA.release();
    GMTrace.o(5548560875520L, 41340);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(5548695093248L, 41341);
    if ((paramInt == 4) && (this.oIv.aXu() != null))
    {
      Eo(this.oIv.aXu());
      GMTrace.o(5548695093248L, 41341);
      return true;
    }
    if (paramKeyEvent == null)
    {
      finish();
      GMTrace.o(5548695093248L, 41341);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(5548695093248L, 41341);
    return bool;
  }
  
  private final class a
  {
    String id;
    String name;
    String oIA;
    boolean oIB;
    String oIz;
    int type;
    
    public a(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, boolean paramBoolean)
    {
      GMTrace.i(5505879638016L, 41022);
      this.id = paramString1;
      this.name = paramString2;
      this$1 = paramString3;
      if (paramString3 == null) {
        this$1 = "";
      }
      this.oIz = CompressPreviewUI.this;
      this.type = paramInt;
      this.oIA = paramString4;
      this.oIB = paramBoolean;
      GMTrace.o(5505879638016L, 41022);
    }
    
    public final boolean aXt()
    {
      GMTrace.i(5506013855744L, 41023);
      if (this.type == 1)
      {
        GMTrace.o(5506013855744L, 41023);
        return true;
      }
      GMTrace.o(5506013855744L, 41023);
      return false;
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    CompressPreviewUI.a oIC;
    List<CompressPreviewUI.a> oID;
    
    private b()
    {
      GMTrace.i(5493128953856L, 40927);
      this.oID = null;
      GMTrace.o(5493128953856L, 40927);
    }
    
    public final String aXu()
    {
      GMTrace.i(5493263171584L, 40928);
      if ((this.oIC == null) || (this.oIC.oIz == null))
      {
        GMTrace.o(5493263171584L, 40928);
        return null;
      }
      if (this.oIC.oIz.length() == 0)
      {
        GMTrace.o(5493263171584L, 40928);
        return "";
      }
      int i = this.oIC.id.indexOf(this.oIC.oIz);
      if (i >= 0)
      {
        String str = this.oIC.id.substring(0, i) + this.oIC.oIz;
        GMTrace.o(5493263171584L, 40928);
        return str;
      }
      GMTrace.o(5493263171584L, 40928);
      return null;
    }
    
    public final int getCount()
    {
      GMTrace.i(5493397389312L, 40929);
      if (this.oID != null)
      {
        int i = this.oID.size();
        GMTrace.o(5493397389312L, 40929);
        return i;
      }
      GMTrace.o(5493397389312L, 40929);
      return 0;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5493665824768L, 40931);
      GMTrace.o(5493665824768L, 40931);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5493800042496L, 40932);
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = View.inflate(CompressPreviewUI.this.vov.voR, R.i.cZo, null);
        paramView = new a();
        paramView.jjR = ((ImageView)paramViewGroup.findViewById(R.h.bHW));
        paramView.kIZ = ((TextView)paramViewGroup.findViewById(R.h.bIc));
        paramView.oIE = ((TextView)paramViewGroup.findViewById(R.h.bId));
        paramView.oIF = ((ImageView)paramViewGroup.findViewById(R.h.bIe));
        paramViewGroup.setTag(paramView);
      }
      a locala = (a)paramViewGroup.getTag();
      CompressPreviewUI.a locala1 = sG(paramInt);
      if ((paramInt == 0) && (aXu() != null))
      {
        paramView = locala.jjR;
        paramInt = R.g.bcg;
        paramView.setImageResource(paramInt);
        paramView = locala.oIF;
        if (!locala1.oIB) {
          break label234;
        }
      }
      label234:
      for (paramInt = 0;; paramInt = 4)
      {
        paramView.setVisibility(paramInt);
        locala.kIZ.setText(locala1.name);
        locala.oIE.setText(locala1.oIA);
        GMTrace.o(5493800042496L, 40932);
        return paramViewGroup;
        paramView = locala.jjR;
        if (locala1.aXt())
        {
          paramInt = R.g.bch;
          break;
        }
        paramInt = FileExplorerUI.OM(locala1.name);
        break;
      }
    }
    
    public final CompressPreviewUI.a sG(int paramInt)
    {
      GMTrace.i(5493531607040L, 40930);
      if ((this.oID != null) && (this.oID.size() > paramInt))
      {
        CompressPreviewUI.a locala = (CompressPreviewUI.a)this.oID.get(paramInt);
        GMTrace.o(5493531607040L, 40930);
        return locala;
      }
      GMTrace.o(5493531607040L, 40930);
      return null;
    }
    
    private final class a
    {
      ImageView jjR;
      TextView kIZ;
      TextView oIE;
      ImageView oIF;
      
      public a()
      {
        GMTrace.i(5511516782592L, 41064);
        GMTrace.o(5511516782592L, 41064);
      }
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */