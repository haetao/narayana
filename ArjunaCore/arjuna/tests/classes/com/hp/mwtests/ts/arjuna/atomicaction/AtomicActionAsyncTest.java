/*
 *  JBoss, Home of Professional Open Source.
 *  Copyright 2013, Red Hat, Inc., and individual contributors
 *  as indicated by the @author tags. See the copyright.txt file in the
 *  distribution for a full listing of individual contributors.
 *
 *  This is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU Lesser General Public License as
 *  published by the Free Software Foundation; either version 2.1 of
 *  the License, or (at your option) any later version.
 *
 *  This software is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this software; if not, write to the Free
 *  Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 *  02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.hp.mwtests.ts.arjuna.atomicaction;

import com.hp.mwtests.ts.arjuna.resources.TestBase;
import org.junit.Test;
import org.junit.Assert;
import org.junit.BeforeClass;

import com.arjuna.ats.arjuna.common.arjPropertyManager;

public class AtomicActionAsyncTest extends AtomicActionTestBase
{
    // NOTE: The following bean properties can only be set once (because TxControl takes a static copy of them)
    @BeforeClass
    public static void init() {
        AtomicActionTestBase.init(true);
    }

    @Test
    @Override
    public void testCommit() throws Exception {
        super.testCommit();
    }

    @Test
    @Override
    public void testAbort() throws Exception {
        super.testAbort();
    }

    @Test
    public void testCompletionWithFailuresAsyncAfterCompletion() throws Exception {
        AtomicActionTestBase.init(false);
        arjPropertyManager.getCoordinatorEnvironmentBean().setAsyncAfterSynchronization(true);
        super.testCompletionWithFailures();
        AtomicActionTestBase.init(true);
    }

    @Test
    @Override
    public void testPrepareWithLRRSuccess() {
        super.testPrepareWithLRRSuccess();
    }

    @Test
    @Override
    public void testPrepareWithLRRFailOn2PCAwareResourcePrepare() {
        super.testPrepareWithLRRFailOn2PCAwareResourcePrepare();
    }

    @Test
    @Override
    public void testPrepareWithLRRFailOn2PCUnawareResourcePrepare() {
        super.testPrepareWithLRRFailOn2PCUnawareResourcePrepare();
    }

    @Test
    @Override
    public void testPrepareWithLRRFailOn2PCAwareResourceCommit() {
        super.testPrepareWithLRRFailOn2PCAwareResourceCommit();
    }

    @Test
    @Override
    public void testCompletionWithoutFailures() throws Exception {
        super.testCompletionWithoutFailures();
    }

    @Test
    @Override
    public void testCompletionWithFailures() throws Exception {
        super.testCompletionWithFailures();
    }

    @Test
    @Override
    public void testCompletionWithException() throws Exception {
        super.testCompletionWithException();
    }

    @Test
    public void testHeuristicNotification() throws Exception {
        // NOTE: cannot test for heuristics with asynchronous commit
        // - setting reportHeuristics during commit will override the asynchronous commit config setting
        super.testHeuristicNotification(true);
    }

    @Test
    @Override
    public void testRegistrationDuringCompletion() throws Exception {
        super.testRegistrationDuringCompletion();
    }

    @Test
    @Override
    public void testRegistrationDuringCompletion2() throws Exception {
        super.testRegistrationDuringCompletion2();
    }

    @Test
    @Override
    public void testRegistrationDuringCompletion2b() throws Exception {
        super.testRegistrationDuringCompletion2b();
    }

    @Test
    @Override
    public void testRegistrationDuringCompletion3() throws Exception {
        super.testRegistrationDuringCompletion3();
    }

    @Test
    @Override
    public void testRegistrationDuringCompletion4() throws Exception {
        super.testRegistrationDuringCompletion4();
    }

    @Test
    @Override
    public void testRegistrationDuringCompletion4b() throws Exception {
        super.testRegistrationDuringCompletion4b();
    }
}
