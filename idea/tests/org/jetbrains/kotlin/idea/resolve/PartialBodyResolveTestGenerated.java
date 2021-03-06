/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.resolve;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/partialBodyResolve")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class PartialBodyResolveTestGenerated extends AbstractPartialBodyResolveTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, TargetBackend.ANY, testDataFilePath);
    }

    public void testAllFilesPresentInPartialBodyResolve() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/resolve/partialBodyResolve"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.ANY, true);
    }

    @TestMetadata("AnonymousObjects.kt")
    public void testAnonymousObjects() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/AnonymousObjects.kt");
    }

    @TestMetadata("As.kt")
    public void testAs() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/As.kt");
    }

    @TestMetadata("BangBang.kt")
    public void testBangBang() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/BangBang.kt");
    }

    @TestMetadata("BangBangHasPlatformTypeBug.kt")
    public void testBangBangHasPlatformTypeBug() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/BangBangHasPlatformTypeBug.kt");
    }

    @TestMetadata("BangBangInIfCondition.kt")
    public void testBangBangInIfCondition() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/BangBangInIfCondition.kt");
    }

    @TestMetadata("ClassInitializerHasNoValue.kt")
    public void testClassInitializerHasNoValue() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/ClassInitializerHasNoValue.kt");
    }

    @TestMetadata("ContractFromBinary.kt")
    public void testContractFromBinary() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/ContractFromBinary.kt");
    }

    @TestMetadata("ContractFromSource.kt")
    public void testContractFromSource() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/ContractFromSource.kt");
    }

    @TestMetadata("DeclarationsBefore.kt")
    public void testDeclarationsBefore() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/DeclarationsBefore.kt");
    }

    @TestMetadata("DoWhile.kt")
    public void testDoWhile() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/DoWhile.kt");
    }

    @TestMetadata("Elvis.kt")
    public void testElvis() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/Elvis.kt");
    }

    @TestMetadata("ElvisReturn.kt")
    public void testElvisReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/ElvisReturn.kt");
    }

    @TestMetadata("ExpressionBodyExplicitType.kt")
    public void testExpressionBodyExplicitType() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/ExpressionBodyExplicitType.kt");
    }

    @TestMetadata("For1.kt")
    public void testFor1() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/For1.kt");
    }

    @TestMetadata("For2.kt")
    public void testFor2() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/For2.kt");
    }

    @TestMetadata("IfBranchesAutoCasts.kt")
    public void testIfBranchesAutoCasts() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfBranchesAutoCasts.kt");
    }

    @TestMetadata("IfBranchesAutoCasts2.kt")
    public void testIfBranchesAutoCasts2() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfBranchesAutoCasts2.kt");
    }

    @TestMetadata("IfBranchesSmartCast.kt")
    public void testIfBranchesSmartCast() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfBranchesSmartCast.kt");
    }

    @TestMetadata("IfCallWithConditionReturn.kt")
    public void testIfCallWithConditionReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfCallWithConditionReturn.kt");
    }

    @TestMetadata("IfEqAutoCast.kt")
    public void testIfEqAutoCast() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfEqAutoCast.kt");
    }

    @TestMetadata("IfIsReturn.kt")
    public void testIfIsReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfIsReturn.kt");
    }

    @TestMetadata("IfNegatedNotNullReturn.kt")
    public void testIfNegatedNotNullReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNegatedNotNullReturn.kt");
    }

    @TestMetadata("IfNotIsError.kt")
    public void testIfNotIsError() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsError.kt");
    }

    @TestMetadata("IfNotIsErrorQualifier.kt")
    public void testIfNotIsErrorQualifier() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsErrorQualifier.kt");
    }

    @TestMetadata("IfNotIsErrorVariable.kt")
    public void testIfNotIsErrorVariable() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsErrorVariable.kt");
    }

    @TestMetadata("IfNotIsMyError.kt")
    public void testIfNotIsMyError() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsMyError.kt");
    }

    @TestMetadata("IfNotIsMyErrorWithAliasImport.kt")
    public void testIfNotIsMyErrorWithAliasImport() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsMyErrorWithAliasImport.kt");
    }

    @TestMetadata("IfNotIsNothingProp.kt")
    public void testIfNotIsNothingProp() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsNothingProp.kt");
    }

    @TestMetadata("IfNotIsReturn.kt")
    public void testIfNotIsReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsReturn.kt");
    }

    @TestMetadata("IfNotIsReturn2.kt")
    public void testIfNotIsReturn2() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsReturn2.kt");
    }

    @TestMetadata("IfNotIsThrow.kt")
    public void testIfNotIsThrow() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotIsThrow.kt");
    }

    @TestMetadata("IfNotNullElseReturn.kt")
    public void testIfNotNullElseReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNotNullElseReturn.kt");
    }

    @TestMetadata("IfNullAlwaysExits.kt")
    public void testIfNullAlwaysExits() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullAlwaysExits.kt");
    }

    @TestMetadata("IfNullAndNullReturn.kt")
    public void testIfNullAndNullReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullAndNullReturn.kt");
    }

    @TestMetadata("IfNullBreak.kt")
    public void testIfNullBreak() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullBreak.kt");
    }

    @TestMetadata("IfNullConditionalReturn.kt")
    public void testIfNullConditionalReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullConditionalReturn.kt");
    }

    @TestMetadata("IfNullConditionalReturnWithElse.kt")
    public void testIfNullConditionalReturnWithElse() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullConditionalReturnWithElse.kt");
    }

    @TestMetadata("IfNullContinue.kt")
    public void testIfNullContinue() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullContinue.kt");
    }

    @TestMetadata("IfNullDoWhileWithBreak.kt")
    public void testIfNullDoWhileWithBreak() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullDoWhileWithBreak.kt");
    }

    @TestMetadata("IfNullElseReturn.kt")
    public void testIfNullElseReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullElseReturn.kt");
    }

    @TestMetadata("IfNullElvisReturn.kt")
    public void testIfNullElvisReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullElvisReturn.kt");
    }

    @TestMetadata("IfNullForWithReturn.kt")
    public void testIfNullForWithReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullForWithReturn.kt");
    }

    @TestMetadata("IfNullOrNullReturn.kt")
    public void testIfNullOrNullReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullOrNullReturn.kt");
    }

    @TestMetadata("IfNullPrint.kt")
    public void testIfNullPrint() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullPrint.kt");
    }

    @TestMetadata("IfNullReturn.kt")
    public void testIfNullReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullReturn.kt");
    }

    @TestMetadata("IfNullWhileTrueWithBreak.kt")
    public void testIfNullWhileTrueWithBreak() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullWhileTrueWithBreak.kt");
    }

    @TestMetadata("IfNullWhileWithReturn.kt")
    public void testIfNullWhileWithReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfNullWhileWithReturn.kt");
    }

    @TestMetadata("IfReturn.kt")
    public void testIfReturn() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IfReturn.kt");
    }

    @TestMetadata("InIfExpressionElse.kt")
    public void testInIfExpressionElse() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/InIfExpressionElse.kt");
    }

    @TestMetadata("InsideAnonymousObject.kt")
    public void testInsideAnonymousObject() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/InsideAnonymousObject.kt");
    }

    @TestMetadata("IntConstantTypeBug.kt")
    public void testIntConstantTypeBug() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/IntConstantTypeBug.kt");
    }

    @TestMetadata("LabeledBreak.kt")
    public void testLabeledBreak() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/LabeledBreak.kt");
    }

    @TestMetadata("LabeledContinue.kt")
    public void testLabeledContinue() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/LabeledContinue.kt");
    }

    @TestMetadata("Lambda.kt")
    public void testLambda() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/Lambda.kt");
    }

    @TestMetadata("LambdaInCurrentStatement.kt")
    public void testLambdaInCurrentStatement() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/LambdaInCurrentStatement.kt");
    }

    @TestMetadata("LambdaReturnsNothing2.kt")
    public void testLambdaReturnsNothing2() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/LambdaReturnsNothing2.kt");
    }

    @TestMetadata("LocalClass.kt")
    public void testLocalClass() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/LocalClass.kt");
    }

    @TestMetadata("LocalFun.kt")
    public void testLocalFun() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/LocalFun.kt");
    }

    @TestMetadata("LocalNothingFun.kt")
    public void testLocalNothingFun() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/LocalNothingFun.kt");
    }

    @TestMetadata("MutliDeclaration.kt")
    public void testMutliDeclaration() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/MutliDeclaration.kt");
    }

    @TestMetadata("NestedLoop.kt")
    public void testNestedLoop() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/NestedLoop.kt");
    }

    @TestMetadata("OutOfBodyResolve.kt")
    public void testOutOfBodyResolve() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/OutOfBodyResolve.kt");
    }

    @TestMetadata("PropertyAccessorBody.kt")
    public void testPropertyAccessorBody() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/PropertyAccessorBody.kt");
    }

    @TestMetadata("PropertyByDelegate.kt")
    public void testPropertyByDelegate() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/PropertyByDelegate.kt");
    }

    @TestMetadata("ReturnLambda.kt")
    public void testReturnLambda() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/ReturnLambda.kt");
    }

    @TestMetadata("Simple.kt")
    public void testSimple() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/Simple.kt");
    }

    @TestMetadata("SmartCastInTheSameStatement.kt")
    public void testSmartCastInTheSameStatement() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/SmartCastInTheSameStatement.kt");
    }

    @TestMetadata("SmartCastOfThis1.kt")
    public void testSmartCastOfThis1() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/SmartCastOfThis1.kt");
    }

    @TestMetadata("SmartCastOfThis2.kt")
    public void testSmartCastOfThis2() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/SmartCastOfThis2.kt");
    }

    @TestMetadata("SmartCastPointsResolveRequired1.kt")
    public void testSmartCastPointsResolveRequired1() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/SmartCastPointsResolveRequired1.kt");
    }

    @TestMetadata("SmartCastPointsResolveRequired2.kt")
    public void testSmartCastPointsResolveRequired2() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/SmartCastPointsResolveRequired2.kt");
    }

    @TestMetadata("ThisQualifiedAutoCast.kt")
    public void testThisQualifiedAutoCast() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/ThisQualifiedAutoCast.kt");
    }

    @TestMetadata("While.kt")
    public void testWhile() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/While.kt");
    }

    @TestMetadata("WhileTrue.kt")
    public void testWhileTrue() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/WhileTrue.kt");
    }

    @TestMetadata("WhileTrueCondition.kt")
    public void testWhileTrueCondition() throws Exception {
        runTest("idea/testData/resolve/partialBodyResolve/WhileTrueCondition.kt");
    }
}
