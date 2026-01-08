module org.apache.commons.logging {
    exports org.apache.commons.logging;
    requires org.jboss.logging;

    provides org.apache.commons.logging.LogFactory with org.apache.commons.logging.impl.JBossLogFactory;
}
