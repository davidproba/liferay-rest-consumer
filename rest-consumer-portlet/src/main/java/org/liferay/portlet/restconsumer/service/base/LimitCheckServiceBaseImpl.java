package org.liferay.portlet.restconsumer.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import org.liferay.portlet.restconsumer.service.LimitCheckService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the limit check remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link org.liferay.portlet.restconsumer.service.impl.LimitCheckServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see org.liferay.portlet.restconsumer.service.impl.LimitCheckServiceImpl
 * @see org.liferay.portlet.restconsumer.service.LimitCheckServiceUtil
 * @generated
 */
public abstract class LimitCheckServiceBaseImpl extends BaseServiceImpl
    implements LimitCheckService, IdentifiableBean {
    @BeanReference(type = org.liferay.portlet.restconsumer.service.LimitCheckService.class)
    protected org.liferay.portlet.restconsumer.service.LimitCheckService limitCheckService;
    @BeanReference(type = org.liferay.portlet.restconsumer.service.NoteLocalService.class)
    protected org.liferay.portlet.restconsumer.service.NoteLocalService noteLocalService;
    @BeanReference(type = org.liferay.portlet.restconsumer.service.NoteService.class)
    protected org.liferay.portlet.restconsumer.service.NoteService noteService;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private LimitCheckServiceClpInvoker _clpInvoker = new LimitCheckServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link org.liferay.portlet.restconsumer.service.LimitCheckServiceUtil} to access the limit check remote service.
     */

    /**
     * Returns the limit check remote service.
     *
     * @return the limit check remote service
     */
    public org.liferay.portlet.restconsumer.service.LimitCheckService getLimitCheckService() {
        return limitCheckService;
    }

    /**
     * Sets the limit check remote service.
     *
     * @param limitCheckService the limit check remote service
     */
    public void setLimitCheckService(
        org.liferay.portlet.restconsumer.service.LimitCheckService limitCheckService) {
        this.limitCheckService = limitCheckService;
    }

    /**
     * Returns the note local service.
     *
     * @return the note local service
     */
    public org.liferay.portlet.restconsumer.service.NoteLocalService getNoteLocalService() {
        return noteLocalService;
    }

    /**
     * Sets the note local service.
     *
     * @param noteLocalService the note local service
     */
    public void setNoteLocalService(
        org.liferay.portlet.restconsumer.service.NoteLocalService noteLocalService) {
        this.noteLocalService = noteLocalService;
    }

    /**
     * Returns the note remote service.
     *
     * @return the note remote service
     */
    public org.liferay.portlet.restconsumer.service.NoteService getNoteService() {
        return noteService;
    }

    /**
     * Sets the note remote service.
     *
     * @param noteService the note remote service
     */
    public void setNoteService(
        org.liferay.portlet.restconsumer.service.NoteService noteService) {
        this.noteService = noteService;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = InfrastructureUtil.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
