/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-03-31 16:56:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.http.HttpServletResponse;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.opengrok.indexer.search.Results;
import org.opengrok.web.api.v1.suggester.provider.service.SuggesterServiceFactory;
import org.opengrok.indexer.web.QueryParameters;
import org.opengrok.indexer.web.SearchHelper;
import org.opengrok.indexer.web.SortOrder;
import org.opengrok.indexer.web.Suggestion;
import java.util.List;
import java.net.URLEncoder;
import org.opengrok.indexer.web.PageConfig;
import org.opengrok.indexer.Info;
import org.opengrok.indexer.web.PageConfig;
import org.opengrok.indexer.web.Prefix;
import org.opengrok.indexer.web.Scripts;
import org.opengrok.indexer.web.PageConfig;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.opengrok.indexer.configuration.Group;
import org.opengrok.indexer.configuration.Project;
import org.opengrok.indexer.search.QueryBuilder;
import org.opengrok.indexer.web.PageConfig;
import org.opengrok.indexer.web.ProjectHelper;
import org.opengrok.indexer.web.QueryParameters;
import org.opengrok.indexer.web.SearchHelper;
import org.opengrok.indexer.web.Util;
import org.opengrok.indexer.web.messages.MessagesUtils;
import java.util.Date;
import java.util.EnumSet;
import org.opengrok.indexer.Info;
import org.opengrok.indexer.web.PageConfig;
import org.opengrok.indexer.web.Prefix;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


    private StringBuilder createUrl(HttpServletRequest request, SearchHelper sh, boolean menu) {
        StringBuilder url = new StringBuilder(64);
        QueryBuilder qb = sh.builder;
        if (menu) {
            url.append("search?");
        } else {
            Util.appendQuery(url, QueryParameters.SORT_PARAM, sh.order.toString());
        }
        if (qb != null) {
            Util.appendQuery(url, QueryParameters.FULL_SEARCH_PARAM, qb.getFreetext());
            Util.appendQuery(url, QueryParameters.DEFS_SEARCH_PARAM, qb.getDefs());
            Util.appendQuery(url, QueryParameters.REFS_SEARCH_PARAM, qb.getRefs());
            Util.appendQuery(url, QueryParameters.PATH_SEARCH_PARAM, qb.getPath());
            Util.appendQuery(url, QueryParameters.HIST_SEARCH_PARAM, qb.getHist());
            Util.appendQuery(url, QueryParameters.TYPE_SEARCH_PARAM, qb.getType());
        }
        if (sh.projects != null && sh.projects.size() != 0) {
            Util.appendQuery(url, QueryParameters.PROJECT_SEARCH_PARAM,
                    PageConfig.get(request).getRequestedProjectsAsString());
        }
        return url;
    }


/* ---------------------- foot.jspf members start --------------------- */
    private static EnumSet<Prefix> needAddDiv = EnumSet.of(
        Prefix.HIST_L, Prefix.XREF_P, Prefix.DIFF_P, Prefix.MORE_P,
        // could NOT find any mapping/reference to those ones:
        Prefix.HIST_S, Prefix.XREF_S, Prefix.DIFF_S, Prefix.MORE_S);
/* ---------------------- foot.jspf members end --------------------- */

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/foot.jspf", Long.valueOf(1585243402000L));
    _jspx_dependants.put("/projects.jspf", Long.valueOf(1585243402000L));
    _jspx_dependants.put("/httpheader.jspf", Long.valueOf(1585243402000L));
    _jspx_dependants.put("/pageheader.jspf", Long.valueOf(1585243402000L));
    _jspx_dependants.put("/menu.jspf", Long.valueOf(1585243402000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.opengrok.indexer.web.Scripts");
    _jspx_imports_classes.add("org.opengrok.indexer.web.QueryParameters");
    _jspx_imports_classes.add("org.opengrok.indexer.web.SearchHelper");
    _jspx_imports_classes.add("java.util.SortedSet");
    _jspx_imports_classes.add("org.opengrok.indexer.configuration.Group");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("org.opengrok.indexer.configuration.Project");
    _jspx_imports_classes.add("org.opengrok.indexer.web.messages.MessagesUtils");
    _jspx_imports_classes.add("java.util.TreeSet");
    _jspx_imports_classes.add("org.opengrok.web.api.v1.suggester.provider.service.SuggesterServiceFactory");
    _jspx_imports_classes.add("java.util.Map");
    _jspx_imports_classes.add("org.opengrok.indexer.web.SortOrder");
    _jspx_imports_classes.add("org.opengrok.indexer.web.Util");
    _jspx_imports_classes.add("org.opengrok.indexer.web.PageConfig");
    _jspx_imports_classes.add("java.util.EnumSet");
    _jspx_imports_classes.add("javax.servlet.http.HttpServletResponse");
    _jspx_imports_classes.add("org.opengrok.indexer.search.QueryBuilder");
    _jspx_imports_classes.add("java.util.Set");
    _jspx_imports_classes.add("org.opengrok.indexer.web.ProjectHelper");
    _jspx_imports_classes.add("org.opengrok.indexer.Info");
    _jspx_imports_classes.add("org.opengrok.indexer.search.Results");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("org.opengrok.indexer.web.Suggestion");
    _jspx_imports_classes.add("java.util.TreeMap");
    _jspx_imports_classes.add("org.apache.lucene.queryparser.classic.QueryParser");
    _jspx_imports_classes.add("org.opengrok.indexer.web.Prefix");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error.jsp", false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;


{
    PageConfig cfg = PageConfig.get(request);
    cfg.checkSourceRootExistence();
}


/* ---------------------- projects.jspf start --------------------- */
{
    // Use UTF-8 if no encoding is specified in the request
    if (request.getCharacterEncoding() == null) {
        request.setCharacterEncoding("UTF-8");
    }

    PageConfig cfg = PageConfig.get(request);

    String projects = cfg.getRequestedProjectsAsString();
    if (projects.length() != 0) {
        Cookie cookie = new Cookie(PageConfig.OPEN_GROK_PROJECT, URLEncoder.encode(projects, "utf-8"));
        response.addCookie(cookie);
    }
}
/* ---------------------- projects.jspf end --------------------- */


/* ---------------------- search.jsp start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);

    long starttime = System.currentTimeMillis();

    SearchHelper searchHelper = cfg.prepareSearch();
    // N.b. searchHelper.destroy() is called via
    // WebappListener.requestDestroyed() on presence of the following
    // REQUEST_ATTR.
    request.setAttribute(SearchHelper.REQUEST_ATTR, searchHelper);
    request.setAttribute("search.jsp-query-start-time", starttime);
    searchHelper.prepareExec(cfg.getRequestedProjects()).executeQuery().prepareSummary();
    // notify suggester that query was searched
    SuggesterServiceFactory.getDefault().onSearch(cfg.getRequestedProjects(), searchHelper.query);
    if (searchHelper.redirect != null) {
        response.sendRedirect(searchHelper.redirect);
    }
    if (searchHelper.errorMsg != null) {
        cfg.setTitle("Search Error");
        // Set status to Internal error. This should help to avoid caching
        // the page by some proxies.
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    } else {
        cfg.setTitle(cfg.getSearchTitle());
    }
    response.addCookie(new Cookie("OpenGrokSorting", URLEncoder.encode(searchHelper.order.toString(), "utf-8")));
}


/* ---------------------- httpheader.jsp start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);
    String styleDir = cfg.getCssDir();
    String ctxPath = request.getContextPath();
    String dstyle = styleDir + '/' + "style-1.0.0.min.css";
    String pstyle = styleDir + '/' + "print-1.0.0.min.css";
    String mstyle = styleDir + '/' + "mandoc-1.0.0.min.css";

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\"\n");
      out.write("      class=\"");
      out.print( request.getServletPath().length() > 0 ? request.getServletPath().substring(1) : "" );
      out.write("\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"robots\" content=\"noindex,nofollow\" />\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("<meta name=\"generator\" content=\"{OpenGrok ");
      out.print(Info.getVersion());
      out.write(' ');
      out.write('(');
      out.print(Info.getRevision());
      out.write(")\" />\n");
      out.write("<link rel=\"icon\" href=\"");
      out.print(styleDir);
      out.write("/img/icon.png\" type=\"image/png\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\"\n");
      out.write("    title=\"Default\" href=\"");
      out.print( dstyle );
      out.write("\" />\n");
      out.write("<link rel=\"alternate stylesheet\" type=\"text/css\" media=\"all\"\n");
      out.write("    title=\"Paper White\" href=\"");
      out.print( pstyle );
      out.write("\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( mstyle );
      out.write("\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print( pstyle );
      out.write("\" media=\"print\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(styleDir);
      out.write("/jquery-ui-1.12.1-custom.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(styleDir);
      out.write("/jquery-ui-1.12.1-custom.structure.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(styleDir);
      out.write("/jquery-ui-1.12.1-custom.theme.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(styleDir);
      out.write("/jquery.tooltip.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(styleDir);
      out.write("/jquery.tablesorter.min.css\" />\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(styleDir);
      out.write("/searchable-option-list-2.0.3.min.css\" />\n");
      out.write("\n");

    /**
     * The order can be arbitrary here, it is hardcoded in Scripts. These
     * are printed out in footer.
     *
     * @see Scripts
     */
    cfg.addScript("jquery");
    cfg.addScript("jquery-ui");
    cfg.addScript("jquery-tablesorter");
    cfg.addScript("tablesorter-parsers");
    cfg.addScript("searchable-option-list");
    cfg.addScript("utils");
    cfg.addScript("jquery-caret");

if (cfg.getPrefix().equals(Prefix.HIST_L)) {
    out.write("<link rel=\"alternate\" type=\"application/rss+xml\" " +
        "title=\"RSS feed for " + cfg.getPath() + "\" " +
        "href=\"" + ctxPath + Prefix.RSS_P + cfg.getPath() + "\" />");
}

      out.write("<link rel=\"search\" href=\"");
      out.print(ctxPath);
      out.write("/opensearch\"\n");
      out.write("    type=\"application/opensearchdescription+xml\"\n");
      out.write("    title=\"OpenGrok Search for current project(s)\" />\n");
      out.write("<script type=\"text/javascript\">/* <![CDATA[ */\n");
      out.write("    window.contextPath = '");
      out.print( ctxPath );
      out.write("';\n");
      out.write("    document.xrefPath = '");
      out.print( request.getContextPath() + Prefix.XREF_P );
      out.write("';\n");
      out.write("    document.pageReady = [];\n");
      out.write("    document.domReady = [];\n");
      out.write("/* ]]> */\n");
      out.write("</script>\n");
      out.print( cfg.getEnv().getIncludeFiles().getHttpHeaderIncludeFileContent(false) );
      out.write("<title>");
      out.print(cfg.getTitle());
      out.write("</title>");

    out.write(cfg.getHeaderData());

      out.write("</head>");

}
/* ---------------------- httpheader.jsp end --------------------- */

      out.write("<body>\n");
      out.write("<div id=\"page\">\n");
      out.write("    <div id=\"whole_header\">\n");
      out.write("        <div id=\"header\">");

/* ---------------------- pageheader.jspf start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);

      out.print( cfg.getEnv().getIncludeFiles().getHeaderIncludeFileContent(false) );
 
}
/* ---------------------- pageheader.jspf end --------------------- */

      out.write("</div>\n");
      out.write("        <div id=\"Masthead\">\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath() );
      out.write("/\"><span id=\"home\"></span>Home</a>\n");
      out.write("            ");
      out.write("<div id=\"sortfield\">\n");
      out.write("                <label for=\"sortby\">Sort by</label>\n");
      out.write("                ");

{
    PageConfig cfg = PageConfig.get(request);
    SearchHelper searchHelper = (SearchHelper) request.getAttribute(SearchHelper.REQUEST_ATTR);
    StringBuilder url = createUrl(request, searchHelper, true).append("&amp;").
            append(QueryParameters.SORT_PARAM_EQ);
    int ordcnt = 0;
    for (SortOrder o : SortOrder.values()) {
        if (searchHelper.order == o) {
                    
      out.write("<span class=\"active\">");
      out.print( o.getDesc() );
      out.write("</span>");

        } else {
                    
      out.write("<a href=\"");
      out.print( url );
      out.print( o );
      out.write('"');
      out.write('>');
      out.print( o.getDesc() );
      out.write("</a>");

        }
        ordcnt++;
        if (ordcnt != (SortOrder.values().length)) {
            
      out.write(' ');
      out.write('|');
      out.write(' ');

        }
    }
}
                
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"bar\">\n");
      out.write("        </div>\n");
      out.write("        <div id=\"menu\">");

/* ---------------------- menu.jspf start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);
    ProjectHelper ph = ProjectHelper.getInstance(cfg);
    String messages;
    Set<Project> projects = ph.getAllProjects();
    if (projects == null) {
        projects = new TreeSet<>();
    }
    int projectsSize = ph.getAllUngrouped().size();
    if (ph.getGroups().size() > 0 && ph.getAllUngrouped().size() > 0)
        projectsSize++;
    for (Group group : ph.getGroups()) {
        projectsSize++;
        projectsSize += ph.getAllGrouped(group).size();
    }
    TreeMap<String, String> pMap = new TreeMap<>();
    QueryBuilder queryParams = cfg.getQueryBuilder();
    if (projects.size() != 0) {
        for (Project p : projects) {
            String name = p.getName();
            String esc = Util.formQuoteEscape(p.getName());
            pMap.put(name, esc);
        }
    }

      out.write("<script type=\"text/javascript\">/* <![CDATA[ */\n");
      out.write("document.domReady.push(function() { domReadyMenu(); });\n");
      out.write("/* ]]> */\n");
      out.write("</script>\n");
      out.write("<form action=\"");
      out.print( request.getContextPath() );
      out.write("/search\" id=\"sbox\" onsubmit=\"searchSubmit(this)\">\n");
      out.write("<div id=\"qtbl\">\n");
      out.write("    <table>\n");
      out.write("    ");

    if (projects.size() != 0) {
    
      out.write("<tbody id=\"ptbl\">\n");
      out.write("    <tr>\n");
      out.write("    <td id=\"projectLabelTd\">\n");
      out.write("    <label for=\"");
      out.print( QueryParameters.PROJECT_SEARCH_PARAM );
      out.write("\">Project(s)</label>\n");
      out.write("    </td>\n");
      out.write("    <td colspan=\"2\">\n");
      out.write("    <select tabindex=\"8\" class=\"q\" id=\"");
      out.print( QueryParameters.PROJECT_SEARCH_PARAM );
      out.write("\"\n");
      out.write("        name=\"");
      out.print( QueryParameters.PROJECT_SEARCH_PARAM );
      out.write("\" multiple=\"multiple\" size=\"");
      out.print(
        Math.min(15, projectsSize) );
      out.write('"');
      out.write('>');

        SortedSet<String> pRequested = new TreeSet<>(cfg.getRequestedProjects());
        for (Group group : ph.getGroups()) {
            Set<Project> groupProjects = ph.getAllGrouped(group);
            if (groupProjects.size() > 0) {
                
      out.write("<optgroup label=\"");
      out.print( group.getName() );
      out.write('"');
      out.write('>');

                for (Project p : groupProjects) {
                    if (!p.isIndexed()) {
                        continue;
                    }

                // TODO below "selected" has no effect if one refreshes the page
                // with F5

                
      out.write("<option value=\"");
      out.print( p.getName() );
      out.write('"');

                    if (pRequested.contains(p.getName())) {
                        
      out.write(" selected=\"selected\"");

                        pRequested.remove(p.getName());
                    }
                    if (!(messages = MessagesUtils.messagesToJson(p)).isEmpty()) {
                        
      out.write(" data-messages='");
      out.print( messages );
      out.write("' data-messages-level='");
      out.print( MessagesUtils.getMessageLevel(p.getName()) );
      out.write('\'');
      out.write(' ');

                    }
                    
      out.write('>');
      out.print( Util.formQuoteEscape(p.getName()) );
      out.write("</option>");

                }
                
      out.write("</optgroup>");

            }
        }

        // Handle projects not listed in any group.
        if (ph.getGroups().size() > 0 && ph.getAllUngrouped().size() > 0) {
            
      out.write("<optgroup label=\"Other\">");

        }
        for (Project p : ph.getAllUngrouped()) {
            if (!p.isIndexed()) {
                continue;
            }

        
      out.write("<option value=\"");
      out.print( p.getName() );
      out.write('"');

            if (pRequested.contains(p.getName())) {
                
      out.write(" selected=\"selected\"");

                pRequested.remove(p.getName());
            }
            if (!(messages = MessagesUtils.messagesToJson(p)).isEmpty()) {
                
      out.write(" data-messages='");
      out.print( messages );
      out.write("' data-messages-level='");
      out.print( MessagesUtils.getMessageLevel(p.getName()) );
      out.write('\'');
      out.write(' ');

            }
            
      out.write('>');
      out.print( Util.formQuoteEscape(p.getName()) );
      out.write("</option>");

        }
        if (ph.getGroups().size() > 0 && ph.getAllUngrouped().size() > 0) {
            
      out.write("</optgroup>");

        }
    
      out.write("</select>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td colspan=\"3\" >\n");
      out.write("    <button tabindex=\"6\" type=\"button\"\n");
      out.write("        onclick=\"javascript: selectAllProjects(); return false;\"\n");
      out.write("        >select all</button>\n");
      out.write("    &nbsp;\n");
      out.write("    <button tabindex=\"7\" type=\"button\"\n");
      out.write("        onclick=\"javascript: invertAllProjects(); return false;\"\n");
      out.write("        >invert selection</button>\n");
      out.write("    &nbsp;\n");
      out.write("    <button tabindex=\"8\" type=\"button\"\n");
      out.write("        onclick=\"javascript: deselectAllProjects(); return false;\"\n");
      out.write("        >clear</button>\n");
      out.write("    </td>\n");
      out.write("    </tr>\n");
      out.write("    </tbody>\n");
      out.write("    ");

    }
    
      out.write("<tbody>\n");
      out.write("    <tr>\n");
      out.write("        <td><label for=\"");
      out.print( QueryParameters.FULL_SEARCH_PARAM );
      out.write("\"\n");
      out.write("              title=\"Text token(s) or other fields to be found (Lucene query--this is not full text)\">\n");
      out.write("            Full&nbsp;Search</label></td>\n");
      out.write("        <td colspan=\"2\"><input tabindex=\"1\" class=\"q\"\n");
      out.write("                name=\"");
      out.print( QueryParameters.FULL_SEARCH_PARAM );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( QueryParameters.FULL_SEARCH_PARAM );
      out.write("\" type=\"text\" value=\"");
      out.print(
                Util.formQuoteEscape(queryParams.getFreetext()) );
      out.write("\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label for=\"");
      out.print( QueryParameters.DEFS_SEARCH_PARAM );
      out.write("\"\n");
      out.write("              title=\"Definitions of function/variable/class\">Definition</label></td>\n");
      out.write("        <td colspan=\"2\"><input class=\"q\" tabindex=\"2\"\n");
      out.write("            name=\"");
      out.print( QueryParameters.DEFS_SEARCH_PARAM );
      out.write("\"\n");
      out.write("            id=\"");
      out.print( QueryParameters.DEFS_SEARCH_PARAM );
      out.write("\" type=\"text\" value=\"");
      out.print(
            Util.formQuoteEscape(queryParams.getDefs()) );
      out.write("\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label for=\"");
      out.print( QueryParameters.REFS_SEARCH_PARAM );
      out.write("\"\n");
      out.write("              title=\"Usage of function/variable/class\">Symbol</label></td>\n");
      out.write("        <td colspan=\"2\"><input class=\"q\" tabindex=\"3\"\n");
      out.write("            name=\"");
      out.print( QueryParameters.REFS_SEARCH_PARAM );
      out.write("\"\n");
      out.write("            id=\"");
      out.print( QueryParameters.REFS_SEARCH_PARAM );
      out.write("\" type=\"text\" value=\"");
      out.print(
            Util.formQuoteEscape(queryParams.getRefs()) );
      out.write("\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><label for=\"");
      out.print( QueryParameters.PATH_SEARCH_PARAM );
      out.write("\"\n");
      out.write("              title=\"Path or parts of it (no need to use separators)\">File&nbsp;Path</label></td>\n");
      out.write("        <td colspan=\"2\"><input class=\"q\" tabindex=\"4\"\n");
      out.write("            name=\"");
      out.print( QueryParameters.PATH_SEARCH_PARAM );
      out.write("\"\n");
      out.write("            id=\"");
      out.print( QueryParameters.PATH_SEARCH_PARAM );
      out.write("\" type=\"text\" value=\"");
      out.print(
            Util.formQuoteEscape(queryParams.getPath()) );
      out.write("\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    ");

        if (cfg.getEnv().isHistoryEnabled()) {
    
      out.write("<tr>\n");
      out.write("        <td><label for=\"");
      out.print( QueryParameters.HIST_SEARCH_PARAM );
      out.write("\"\n");
      out.write("              title=\"Search in project(s) repository log messages\">History</label></td>\n");
      out.write("        <td colspan=\"2\"><input class=\"q\" tabindex=\"5\"\n");
      out.write("            name=\"");
      out.print( QueryParameters.HIST_SEARCH_PARAM );
      out.write("\"\n");
      out.write("            id=\"");
      out.print( QueryParameters.HIST_SEARCH_PARAM );
      out.write("\" type=\"text\" value=\"");
      out.print(
            Util.formQuoteEscape(queryParams.getHist()) );
      out.write("\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    ");

        }
    
      out.write("<tr>\n");
      out.write("        <td id=\"typeLabelTd\"><label for=\"");
      out.print( QueryParameters.TYPE_SEARCH_PARAM );
      out.write("\">Type</label></td>\n");
      out.write("        <td><select class=\"q\" tabindex=\"6\" name=\"");
      out.print( QueryParameters.TYPE_SEARCH_PARAM );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( QueryParameters.TYPE_SEARCH_PARAM );
      out.write('"');
      out.write('>');

                String selection = queryParams.getType();
                
      out.write("<option value=\"\">Any</option>");

                for (Map.Entry<String, String> d : SearchHelper.getFileTypeDescriptions()) {
                    
      out.write("<option value=\"");
      out.print( Util.formQuoteEscape(d.getKey()) );
      out.write('"');

                    if (d.getKey().equals(selection)) {
                        
      out.write(" selected=\"selected\"");

                    }
                    
      out.write('>');
      out.print( Util.htmlize(d.getValue()) );
      out.write("</option>");

                }
            
      out.write("</select>\n");
      out.write("        </td>\n");
      out.write("        <td id=\"type-select-container\">\n");
      out.write("            <!-- filled with javascript -->\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    </tbody>\n");
      out.write("</table>\n");
      out.write("<div id=\"form-controls\">\n");
      out.write("    <input tabindex=\"9\" class=\"submit btn\" type=\"submit\" value=\"Search\"/>\n");
      out.write("    <input tabindex=\"10\" class=\"submit btn\" onclick=\"javascript: clearSearchFrom();\"\n");
      out.write("           type=\"button\" value=\"Clear\"/>\n");
      out.write("    <input tabindex=\"11\" class=\"submit btn\" onclick=\"window.open('help.jsp', '_blank');\"\n");
      out.write("           type=\"button\" value=\"Help\"/>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"ltbl\">\n");
      out.write("    <!-- filled with javascript -->\n");
      out.write("</div>\n");
      out.write("</form>\n");
      out.write("<div class=\"clearfix\"></div>\n");

}
/* ---------------------- menu.jspf end --------------------- */

      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"results\"> ");

{
    PageConfig cfg = PageConfig.get(request);
    SearchHelper searchHelper = (SearchHelper) request.getAttribute(SearchHelper.REQUEST_ATTR);
    Long starttime = (Long) request.getAttribute("search.jsp-query-start-time");
    // TODO spellchecking cycle below is not that great and we only create
    // suggest links for every token in query, not for a query as whole
    if (searchHelper.errorMsg != null) {
        
      out.write("<h3>Error</h3><p class=\"pagetitle\">");

        if (searchHelper.errorMsg.startsWith((SearchHelper.PARSE_ERROR_MSG))) {
            
      out.print( Util.htmlize(SearchHelper.PARSE_ERROR_MSG) );
      out.write("<br/>You might try to enclose your search term in quotes,\n");
      out.write("            <a href=\"help.jsp#escaping\">escape special characters</a>\n");
      out.write("            with <b>\\</b>, or read the <a href=\"help.jsp\">Help</a>\n");
      out.write("            on the query language. Error message from parser:<br/>\n");
      out.write("            ");
      out.print( Util.htmlize(searchHelper.errorMsg.substring(
                        SearchHelper.PARSE_ERROR_MSG.length())) );

        } else {
            
      out.print( Util.htmlize(searchHelper.errorMsg) );

        }
      out.write("</p>");

    } else if (searchHelper.hits == null) {
        
      out.write("<p class=\"pagetitle\">No hits</p>");

    } else if (searchHelper.hits.length == 0) {
        List<Suggestion> hints = searchHelper.getSuggestions();
        for (Suggestion hint : hints) {
        
      out.write("<p class=\"suggestions\"><font color=\"#cc0000\">Did you mean (for ");
      out.print( hint.name );
      out.write(")</font>:");

	  if (hint.freetext!=null) { 
	    for (String word : hint.freetext) {
            
      out.write("<a href=\"search?");
      out.print( QueryParameters.FULL_SEARCH_PARAM_EQ );
      out.print( Util.URIEncode(QueryParser.escape(word)) );
      out.write('"');
      out.write('>');
      out.print(
                Util.htmlize(word) );
      out.write("</a> &nbsp; ");

	    }
	  }
	  if (hint.refs!=null)  {
	    for (String word : hint.refs) {
            
      out.write("<a href=\"search?");
      out.print( QueryParameters.REFS_SEARCH_PARAM_EQ );
      out.print( Util.URIEncode(QueryParser.escape(word)) );
      out.write('"');
      out.write('>');
      out.print(
                Util.htmlize(word) );
      out.write("</a> &nbsp; ");

	    }
	  }
	  if (hint.defs!=null) {
	    for (String word : hint.defs) {
            
      out.write("<a href=\"search?");
      out.print( QueryParameters.DEFS_SEARCH_PARAM_EQ );
      out.print( Util.URIEncode(QueryParser.escape(word)) );
      out.write('"');
      out.write('>');
      out.print(
                Util.htmlize(word) );
      out.write("</a> &nbsp; ");

            }
	  }
        
      out.write("</p>");

        }
        
      out.write("<p class=\"pagetitle\"> Your search <b>");

            Util.htmlize(searchHelper.query.toString(), out); 
      out.write("</b>\n");
      out.write("            did not match any files.\n");
      out.write("            <br/> Suggestions:<br/>\n");
      out.write("        </p>\n");
      out.write("        <ul>\n");
      out.write("            <li>Make sure all terms are spelled correctly.</li>\n");
      out.write("            <li>Try different keywords.</li>\n");
      out.write("            <li>Try more general keywords.</li>\n");
      out.write("            <li>Use 'wil*' cards if you are looking for partial match.</li>\n");
      out.write("        </ul>\n");
      out.write("        <p><b>Completed in ");
      out.print( System.currentTimeMillis() - starttime
            );
      out.write(" milliseconds</b></p>\n");
      out.write("\t");

    } else {
        int start = searchHelper.start;
        int max = searchHelper.maxItems;
        long totalHits = searchHelper.totalHits;
        long thispage = Math.min(totalHits - start, max);  // number of items to display on the current page
        // We have a lots of results to show: create a slider for
        String slider = Util.createSlider(start, max, totalHits, request);
        
      out.write("<p class=\"pagetitle\">Searched <b>");

            Util.htmlize(searchHelper.query.toString(), out);
            
      out.write("</b> (Results <b> ");
      out.print( start + 1 );
      out.write(' ');
      out.write('–');
      out.write(' ');
      out.print( thispage + start
            );
      out.write("</b> of <b>");
      out.print( totalHits );
      out.write("</b>) sorted by ");
      out.print(
            searchHelper.order.getDesc() );
      out.write("</p>");

        if (slider.length() > 0) {
        
      out.write("<p class=\"slider\">");
      out.print( slider );
      out.write("</p>");

        }
        
      out.write("<table>");

        Results.prettyPrint(out, searchHelper, start, start + thispage);
        
      out.write("</table>\n");
      out.write("        <p><b>Completed in ");
      out.print( System.currentTimeMillis() - starttime
            );
      out.write(" milliseconds</b></p>");

        if (slider.length() > 0) {
        
      out.write("<p class=\"slider\">");
      out.print( slider );
      out.write("</p>");

        }
        
      out.write("</div>");

    }
    // Note that searchHelper.destroy() is called via WebappListener.requestDestroyed().
}
/* ---------------------- search.jsp end --------------------- */


/* ---------------------- foot.jspf start --------------------- */
{
    PageConfig cfg = PageConfig.get(request);
    Date dateForLastIndexRun = cfg.getEnv().getDateForLastIndexRun();
    
        
      out.write("<div id=\"footer\">\n");
      out.write("<p><a href=\"http://opengrok.github.com/OpenGrok/\"\n");
      out.write(" title=\"Served by OpenGrok (");
      out.print( Info.getVersion() );
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( Info.getShortRevision() );
      out.write(")\"><span id=\"fti\"></span></a></p>\n");
 if(dateForLastIndexRun != null) { 
      out.write("<p>Last Index update ");
      out.print( dateForLastIndexRun );
      out.write("</p>\n");
}
      out.print( cfg.getEnv().getIncludeFiles().getFooterIncludeFileContent(false) );

    if (needAddDiv.contains(cfg.getPrefix())) {
        
      out.write("</div>");
 // #content
    }
    // #footer, #page:
    
      out.write("</div>\n");
      out.write("</div>\n");

    /**
     * Print out all collected javascript files (or inline script) by the calls
     * to {@link PageConfig#addScript} methods.
     */

      out.print( PageConfig.get(request).getScripts() );
      out.write("</body>\n");
      out.write("</html>\n");

}
/* ---------------------- foot.jspf end --------------------- */

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
