/*
 * Drizzle JDBC
 *
 * Copyright (C) 2009 Marcus Eriksson (krummas@gmail.com)
 * All rights reserved.
 *
 * Use and distribution licensed under the BSD license.
 */

package org.drizzle.jdbc.internal.common.query;

import org.drizzle.jdbc.internal.common.query.QueryFactory;
import org.drizzle.jdbc.internal.common.query.Query;
import org.drizzle.jdbc.internal.common.query.ParameterizedQuery;

/**
 .
 * User: marcuse
 * Date: Mar 18, 2009
 * Time: 10:14:27 PM

 */
public class DrizzleQueryFactory implements QueryFactory {
    public Query createQuery(String query) {
        return new DrizzleQuery(query);
    }

    public ParameterizedQuery createParameterizedQuery(String query) {
        return new DrizzleParameterizedQuery(query);
    }

    public ParameterizedQuery createParameterizedQuery(ParameterizedQuery dQuery) {
        return new DrizzleParameterizedQuery(dQuery);
    }
}