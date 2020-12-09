package cn.coreqi.db.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class TMenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.path
     *
     * @mbg.generated
     */
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.component
     *
     * @mbg.generated
     */
    private String component;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.iconCls
     *
     * @mbg.generated
     */
    private String iconcls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.keepAlive
     *
     * @mbg.generated
     */
    private Boolean keepalive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.requireAuth
     *
     * @mbg.generated
     */
    private Boolean requireauth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.parentId
     *
     * @mbg.generated
     */
    private Integer parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_menu.enabled
     *
     * @mbg.generated
     */
    private Boolean enabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.id
     *
     * @return the value of t_menu.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.id
     *
     * @param id the value for t_menu.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.url
     *
     * @return the value of t_menu.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.url
     *
     * @param url the value for t_menu.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.path
     *
     * @return the value of t_menu.path
     *
     * @mbg.generated
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.path
     *
     * @param path the value for t_menu.path
     *
     * @mbg.generated
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.component
     *
     * @return the value of t_menu.component
     *
     * @mbg.generated
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.component
     *
     * @param component the value for t_menu.component
     *
     * @mbg.generated
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.name
     *
     * @return the value of t_menu.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.name
     *
     * @param name the value for t_menu.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.iconCls
     *
     * @return the value of t_menu.iconCls
     *
     * @mbg.generated
     */
    public String getIconcls() {
        return iconcls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.iconCls
     *
     * @param iconcls the value for t_menu.iconCls
     *
     * @mbg.generated
     */
    public void setIconcls(String iconcls) {
        this.iconcls = iconcls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.keepAlive
     *
     * @return the value of t_menu.keepAlive
     *
     * @mbg.generated
     */
    public Boolean getKeepalive() {
        return keepalive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.keepAlive
     *
     * @param keepalive the value for t_menu.keepAlive
     *
     * @mbg.generated
     */
    public void setKeepalive(Boolean keepalive) {
        this.keepalive = keepalive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.requireAuth
     *
     * @return the value of t_menu.requireAuth
     *
     * @mbg.generated
     */
    public Boolean getRequireauth() {
        return requireauth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.requireAuth
     *
     * @param requireauth the value for t_menu.requireAuth
     *
     * @mbg.generated
     */
    public void setRequireauth(Boolean requireauth) {
        this.requireauth = requireauth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.parentId
     *
     * @return the value of t_menu.parentId
     *
     * @mbg.generated
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.parentId
     *
     * @param parentid the value for t_menu.parentId
     *
     * @mbg.generated
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_menu.enabled
     *
     * @return the value of t_menu.enabled
     *
     * @mbg.generated
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_menu.enabled
     *
     * @param enabled the value for t_menu.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", path=").append(path);
        sb.append(", component=").append(component);
        sb.append(", name=").append(name);
        sb.append(", iconcls=").append(iconcls);
        sb.append(", keepalive=").append(keepalive);
        sb.append(", requireauth=").append(requireauth);
        sb.append(", parentid=").append(parentid);
        sb.append(", enabled=").append(enabled);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TMenu other = (TMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getPath() == null ? other.getPath() == null : this.getPath().equals(other.getPath()))
            && (this.getComponent() == null ? other.getComponent() == null : this.getComponent().equals(other.getComponent()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIconcls() == null ? other.getIconcls() == null : this.getIconcls().equals(other.getIconcls()))
            && (this.getKeepalive() == null ? other.getKeepalive() == null : this.getKeepalive().equals(other.getKeepalive()))
            && (this.getRequireauth() == null ? other.getRequireauth() == null : this.getRequireauth().equals(other.getRequireauth()))
            && (this.getParentid() == null ? other.getParentid() == null : this.getParentid().equals(other.getParentid()))
            && (this.getEnabled() == null ? other.getEnabled() == null : this.getEnabled().equals(other.getEnabled()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getPath() == null) ? 0 : getPath().hashCode());
        result = prime * result + ((getComponent() == null) ? 0 : getComponent().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIconcls() == null) ? 0 : getIconcls().hashCode());
        result = prime * result + ((getKeepalive() == null) ? 0 : getKeepalive().hashCode());
        result = prime * result + ((getRequireauth() == null) ? 0 : getRequireauth().hashCode());
        result = prime * result + ((getParentid() == null) ? 0 : getParentid().hashCode());
        result = prime * result + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table t_menu
     *
     * @mbg.generated
     */
    public enum Column {
        id("id", "id", "INTEGER", false),
        url("url", "url", "VARCHAR", false),
        path("path", "path", "VARCHAR", true),
        component("component", "component", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        iconcls("iconCls", "iconcls", "VARCHAR", false),
        keepalive("keepAlive", "keepalive", "BIT", false),
        requireauth("requireAuth", "requireauth", "BIT", false),
        parentid("parentId", "parentid", "INTEGER", false),
        enabled("enabled", "enabled", "BIT", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public static Column[] all() {
            return Column.values();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table t_menu
         *
         * @mbg.generated
         */
        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}