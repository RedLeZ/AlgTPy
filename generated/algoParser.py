# Generated from algo.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,48,154,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,1,0,1,0,
        1,0,1,0,1,1,1,1,3,1,33,8,1,5,1,35,8,1,10,1,12,1,38,9,1,1,1,1,1,1,
        2,1,2,1,2,1,2,1,2,1,2,3,2,48,8,2,1,3,1,3,1,3,5,3,53,8,3,10,3,12,
        3,56,9,3,1,4,1,4,1,4,1,4,1,4,3,4,63,8,4,1,4,1,4,1,5,1,5,1,5,1,5,
        1,5,1,6,1,6,1,6,1,6,1,6,1,6,5,6,78,8,6,10,6,12,6,81,9,6,1,6,3,6,
        84,8,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,9,1,
        9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,3,
        10,114,8,10,1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,
        11,1,11,1,11,1,11,1,11,1,11,1,11,3,11,133,8,11,1,11,1,11,1,11,1,
        11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,5,11,147,8,11,10,11,12,
        11,150,9,11,1,12,1,12,1,12,0,1,22,13,0,2,4,6,8,10,12,14,16,18,20,
        22,24,0,5,1,0,19,20,1,0,21,22,1,0,23,28,1,0,29,30,1,0,31,39,162,
        0,26,1,0,0,0,2,36,1,0,0,0,4,47,1,0,0,0,6,54,1,0,0,0,8,57,1,0,0,0,
        10,66,1,0,0,0,12,71,1,0,0,0,14,87,1,0,0,0,16,94,1,0,0,0,18,98,1,
        0,0,0,20,105,1,0,0,0,22,132,1,0,0,0,24,151,1,0,0,0,26,27,5,44,0,
        0,27,28,5,1,0,0,28,29,3,22,11,0,29,1,1,0,0,0,30,32,3,4,2,0,31,33,
        5,47,0,0,32,31,1,0,0,0,32,33,1,0,0,0,33,35,1,0,0,0,34,30,1,0,0,0,
        35,38,1,0,0,0,36,34,1,0,0,0,36,37,1,0,0,0,37,39,1,0,0,0,38,36,1,
        0,0,0,39,40,5,0,0,1,40,3,1,0,0,0,41,48,3,0,0,0,42,48,3,8,4,0,43,
        48,3,10,5,0,44,48,3,12,6,0,45,48,3,18,9,0,46,48,3,20,10,0,47,41,
        1,0,0,0,47,42,1,0,0,0,47,43,1,0,0,0,47,44,1,0,0,0,47,45,1,0,0,0,
        47,46,1,0,0,0,48,5,1,0,0,0,49,50,3,4,2,0,50,51,5,47,0,0,51,53,1,
        0,0,0,52,49,1,0,0,0,53,56,1,0,0,0,54,52,1,0,0,0,54,55,1,0,0,0,55,
        7,1,0,0,0,56,54,1,0,0,0,57,58,5,2,0,0,58,59,5,3,0,0,59,62,5,44,0,
        0,60,61,5,4,0,0,61,63,3,24,12,0,62,60,1,0,0,0,62,63,1,0,0,0,63,64,
        1,0,0,0,64,65,5,5,0,0,65,9,1,0,0,0,66,67,5,6,0,0,67,68,5,3,0,0,68,
        69,3,22,11,0,69,70,5,5,0,0,70,11,1,0,0,0,71,72,5,7,0,0,72,73,3,22,
        11,0,73,74,5,8,0,0,74,75,5,47,0,0,75,79,3,6,3,0,76,78,3,14,7,0,77,
        76,1,0,0,0,78,81,1,0,0,0,79,77,1,0,0,0,79,80,1,0,0,0,80,83,1,0,0,
        0,81,79,1,0,0,0,82,84,3,16,8,0,83,82,1,0,0,0,83,84,1,0,0,0,84,85,
        1,0,0,0,85,86,5,9,0,0,86,13,1,0,0,0,87,88,5,10,0,0,88,89,5,7,0,0,
        89,90,3,22,11,0,90,91,5,8,0,0,91,92,5,47,0,0,92,93,3,6,3,0,93,15,
        1,0,0,0,94,95,5,10,0,0,95,96,5,47,0,0,96,97,3,6,3,0,97,17,1,0,0,
        0,98,99,5,11,0,0,99,100,3,22,11,0,100,101,5,12,0,0,101,102,5,47,
        0,0,102,103,3,6,3,0,103,104,5,13,0,0,104,19,1,0,0,0,105,106,5,14,
        0,0,106,107,5,44,0,0,107,108,5,15,0,0,108,109,3,22,11,0,109,110,
        5,16,0,0,110,113,3,22,11,0,111,112,5,17,0,0,112,114,3,22,11,0,113,
        111,1,0,0,0,113,114,1,0,0,0,114,115,1,0,0,0,115,116,5,12,0,0,116,
        117,5,47,0,0,117,118,3,6,3,0,118,119,5,18,0,0,119,21,1,0,0,0,120,
        121,6,11,-1,0,121,122,5,22,0,0,122,133,3,22,11,7,123,124,5,3,0,0,
        124,125,3,22,11,0,125,126,5,5,0,0,126,133,1,0,0,0,127,133,5,40,0,
        0,128,133,5,41,0,0,129,133,5,43,0,0,130,133,5,42,0,0,131,133,5,44,
        0,0,132,120,1,0,0,0,132,123,1,0,0,0,132,127,1,0,0,0,132,128,1,0,
        0,0,132,129,1,0,0,0,132,130,1,0,0,0,132,131,1,0,0,0,133,148,1,0,
        0,0,134,135,10,11,0,0,135,136,7,0,0,0,136,147,3,22,11,12,137,138,
        10,10,0,0,138,139,7,1,0,0,139,147,3,22,11,11,140,141,10,9,0,0,141,
        142,7,2,0,0,142,147,3,22,11,10,143,144,10,8,0,0,144,145,7,3,0,0,
        145,147,3,22,11,9,146,134,1,0,0,0,146,137,1,0,0,0,146,140,1,0,0,
        0,146,143,1,0,0,0,147,150,1,0,0,0,148,146,1,0,0,0,148,149,1,0,0,
        0,149,23,1,0,0,0,150,148,1,0,0,0,151,152,7,4,0,0,152,25,1,0,0,0,
        11,32,36,47,54,62,79,83,113,132,146,148
    ]

class algoParser ( Parser ):

    grammarFileName = "algo.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'<-'", "'lire'", "'('", "':'", "')'", 
                     "'ecrire'", "'si'", "'alors'", "'finSi'", "'sinon'", 
                     "'tantque'", "'faire'", "'finTantque'", "'pour'", "'de'", 
                     "'\\u00E0'", "'pas='", "'finPour'", "'*'", "'/'", "'+'", 
                     "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
                     "'et'", "'ou'", "'entier'", "'reel'", "'r\\u00E9el'", 
                     "'bool\\u00E9en'", "'booleen'", "'bool'", "'caract\\u00E8re'", 
                     "'caractere'", "'chaine'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "NUMBER", "BOOLEAN", "CHAR", "STRING", "IDENTIFIER", 
                      "LINE_COMMENT", "BLOCK_COMMENT", "NEWLINE", "WS" ]

    RULE_varDecl = 0
    RULE_program = 1
    RULE_statement = 2
    RULE_block = 3
    RULE_inputStmt = 4
    RULE_outputStmt = 5
    RULE_ifStmt = 6
    RULE_elseifBlock = 7
    RULE_elseBlock = 8
    RULE_whileStmt = 9
    RULE_forStmt = 10
    RULE_expr = 11
    RULE_typeName = 12

    ruleNames =  [ "varDecl", "program", "statement", "block", "inputStmt", 
                   "outputStmt", "ifStmt", "elseifBlock", "elseBlock", "whileStmt", 
                   "forStmt", "expr", "typeName" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    T__17=18
    T__18=19
    T__19=20
    T__20=21
    T__21=22
    T__22=23
    T__23=24
    T__24=25
    T__25=26
    T__26=27
    T__27=28
    T__28=29
    T__29=30
    T__30=31
    T__31=32
    T__32=33
    T__33=34
    T__34=35
    T__35=36
    T__36=37
    T__37=38
    T__38=39
    NUMBER=40
    BOOLEAN=41
    CHAR=42
    STRING=43
    IDENTIFIER=44
    LINE_COMMENT=45
    BLOCK_COMMENT=46
    NEWLINE=47
    WS=48

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class VarDeclContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(algoParser.IDENTIFIER, 0)

        def expr(self):
            return self.getTypedRuleContext(algoParser.ExprContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_varDecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVarDecl" ):
                listener.enterVarDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVarDecl" ):
                listener.exitVarDecl(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVarDecl" ):
                return visitor.visitVarDecl(self)
            else:
                return visitor.visitChildren(self)




    def varDecl(self):

        localctx = algoParser.VarDeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_varDecl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 26
            self.match(algoParser.IDENTIFIER)
            self.state = 27
            self.match(algoParser.T__0)
            self.state = 28
            self.expr(0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(algoParser.EOF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.StatementContext)
            else:
                return self.getTypedRuleContext(algoParser.StatementContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(algoParser.NEWLINE)
            else:
                return self.getToken(algoParser.NEWLINE, i)

        def getRuleIndex(self):
            return algoParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = algoParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 17592186063044) != 0):
                self.state = 30
                self.statement()
                self.state = 32
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==47:
                    self.state = 31
                    self.match(algoParser.NEWLINE)


                self.state = 38
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 39
            self.match(algoParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return algoParser.RULE_statement

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class IfStatementContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def ifStmt(self):
            return self.getTypedRuleContext(algoParser.IfStmtContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfStatement" ):
                listener.enterIfStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfStatement" ):
                listener.exitIfStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfStatement" ):
                return visitor.visitIfStatement(self)
            else:
                return visitor.visitChildren(self)


    class WhileStatementContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def whileStmt(self):
            return self.getTypedRuleContext(algoParser.WhileStmtContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhileStatement" ):
                listener.enterWhileStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhileStatement" ):
                listener.exitWhileStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhileStatement" ):
                return visitor.visitWhileStatement(self)
            else:
                return visitor.visitChildren(self)


    class InputStatementContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def inputStmt(self):
            return self.getTypedRuleContext(algoParser.InputStmtContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInputStatement" ):
                listener.enterInputStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInputStatement" ):
                listener.exitInputStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInputStatement" ):
                return visitor.visitInputStatement(self)
            else:
                return visitor.visitChildren(self)


    class ForStatementContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def forStmt(self):
            return self.getTypedRuleContext(algoParser.ForStmtContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForStatement" ):
                listener.enterForStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForStatement" ):
                listener.exitForStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForStatement" ):
                return visitor.visitForStatement(self)
            else:
                return visitor.visitChildren(self)


    class OutputStatementContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def outputStmt(self):
            return self.getTypedRuleContext(algoParser.OutputStmtContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOutputStatement" ):
                listener.enterOutputStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOutputStatement" ):
                listener.exitOutputStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOutputStatement" ):
                return visitor.visitOutputStatement(self)
            else:
                return visitor.visitChildren(self)


    class VarDeclStatementContext(StatementContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.StatementContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def varDecl(self):
            return self.getTypedRuleContext(algoParser.VarDeclContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVarDeclStatement" ):
                listener.enterVarDeclStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVarDeclStatement" ):
                listener.exitVarDeclStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVarDeclStatement" ):
                return visitor.visitVarDeclStatement(self)
            else:
                return visitor.visitChildren(self)



    def statement(self):

        localctx = algoParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.state = 47
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [44]:
                localctx = algoParser.VarDeclStatementContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 41
                self.varDecl()
                pass
            elif token in [2]:
                localctx = algoParser.InputStatementContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 42
                self.inputStmt()
                pass
            elif token in [6]:
                localctx = algoParser.OutputStatementContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 43
                self.outputStmt()
                pass
            elif token in [7]:
                localctx = algoParser.IfStatementContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 44
                self.ifStmt()
                pass
            elif token in [11]:
                localctx = algoParser.WhileStatementContext(self, localctx)
                self.enterOuterAlt(localctx, 5)
                self.state = 45
                self.whileStmt()
                pass
            elif token in [14]:
                localctx = algoParser.ForStatementContext(self, localctx)
                self.enterOuterAlt(localctx, 6)
                self.state = 46
                self.forStmt()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.StatementContext)
            else:
                return self.getTypedRuleContext(algoParser.StatementContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(algoParser.NEWLINE)
            else:
                return self.getToken(algoParser.NEWLINE, i)

        def getRuleIndex(self):
            return algoParser.RULE_block

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBlock" ):
                listener.enterBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBlock" ):
                listener.exitBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBlock" ):
                return visitor.visitBlock(self)
            else:
                return visitor.visitChildren(self)




    def block(self):

        localctx = algoParser.BlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_block)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 17592186063044) != 0):
                self.state = 49
                self.statement()
                self.state = 50
                self.match(algoParser.NEWLINE)
                self.state = 56
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class InputStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(algoParser.IDENTIFIER, 0)

        def typeName(self):
            return self.getTypedRuleContext(algoParser.TypeNameContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_inputStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInputStmt" ):
                listener.enterInputStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInputStmt" ):
                listener.exitInputStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInputStmt" ):
                return visitor.visitInputStmt(self)
            else:
                return visitor.visitChildren(self)




    def inputStmt(self):

        localctx = algoParser.InputStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_inputStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 57
            self.match(algoParser.T__1)
            self.state = 58
            self.match(algoParser.T__2)
            self.state = 59
            self.match(algoParser.IDENTIFIER)
            self.state = 62
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==4:
                self.state = 60
                self.match(algoParser.T__3)
                self.state = 61
                self.typeName()


            self.state = 64
            self.match(algoParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OutputStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(algoParser.ExprContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_outputStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOutputStmt" ):
                listener.enterOutputStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOutputStmt" ):
                listener.exitOutputStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOutputStmt" ):
                return visitor.visitOutputStmt(self)
            else:
                return visitor.visitChildren(self)




    def outputStmt(self):

        localctx = algoParser.OutputStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_outputStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 66
            self.match(algoParser.T__5)
            self.state = 67
            self.match(algoParser.T__2)
            self.state = 68
            self.expr(0)
            self.state = 69
            self.match(algoParser.T__4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IfStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(algoParser.ExprContext,0)


        def NEWLINE(self):
            return self.getToken(algoParser.NEWLINE, 0)

        def block(self):
            return self.getTypedRuleContext(algoParser.BlockContext,0)


        def elseifBlock(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.ElseifBlockContext)
            else:
                return self.getTypedRuleContext(algoParser.ElseifBlockContext,i)


        def elseBlock(self):
            return self.getTypedRuleContext(algoParser.ElseBlockContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_ifStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfStmt" ):
                listener.enterIfStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfStmt" ):
                listener.exitIfStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIfStmt" ):
                return visitor.visitIfStmt(self)
            else:
                return visitor.visitChildren(self)




    def ifStmt(self):

        localctx = algoParser.IfStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_ifStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 71
            self.match(algoParser.T__6)
            self.state = 72
            self.expr(0)
            self.state = 73
            self.match(algoParser.T__7)
            self.state = 74
            self.match(algoParser.NEWLINE)
            self.state = 75
            self.block()
            self.state = 79
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,5,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 76
                    self.elseifBlock() 
                self.state = 81
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,5,self._ctx)

            self.state = 83
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==10:
                self.state = 82
                self.elseBlock()


            self.state = 85
            self.match(algoParser.T__8)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElseifBlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(algoParser.ExprContext,0)


        def NEWLINE(self):
            return self.getToken(algoParser.NEWLINE, 0)

        def block(self):
            return self.getTypedRuleContext(algoParser.BlockContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_elseifBlock

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElseifBlock" ):
                listener.enterElseifBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElseifBlock" ):
                listener.exitElseifBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElseifBlock" ):
                return visitor.visitElseifBlock(self)
            else:
                return visitor.visitChildren(self)




    def elseifBlock(self):

        localctx = algoParser.ElseifBlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_elseifBlock)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.match(algoParser.T__9)
            self.state = 88
            self.match(algoParser.T__6)
            self.state = 89
            self.expr(0)
            self.state = 90
            self.match(algoParser.T__7)
            self.state = 91
            self.match(algoParser.NEWLINE)
            self.state = 92
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ElseBlockContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEWLINE(self):
            return self.getToken(algoParser.NEWLINE, 0)

        def block(self):
            return self.getTypedRuleContext(algoParser.BlockContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_elseBlock

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElseBlock" ):
                listener.enterElseBlock(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElseBlock" ):
                listener.exitElseBlock(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitElseBlock" ):
                return visitor.visitElseBlock(self)
            else:
                return visitor.visitChildren(self)




    def elseBlock(self):

        localctx = algoParser.ElseBlockContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_elseBlock)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 94
            self.match(algoParser.T__9)
            self.state = 95
            self.match(algoParser.NEWLINE)
            self.state = 96
            self.block()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class WhileStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(algoParser.ExprContext,0)


        def NEWLINE(self):
            return self.getToken(algoParser.NEWLINE, 0)

        def block(self):
            return self.getTypedRuleContext(algoParser.BlockContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_whileStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhileStmt" ):
                listener.enterWhileStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhileStmt" ):
                listener.exitWhileStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhileStmt" ):
                return visitor.visitWhileStmt(self)
            else:
                return visitor.visitChildren(self)




    def whileStmt(self):

        localctx = algoParser.WhileStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_whileStmt)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 98
            self.match(algoParser.T__10)
            self.state = 99
            self.expr(0)
            self.state = 100
            self.match(algoParser.T__11)
            self.state = 101
            self.match(algoParser.NEWLINE)
            self.state = 102
            self.block()
            self.state = 103
            self.match(algoParser.T__12)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ForStmtContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENTIFIER(self):
            return self.getToken(algoParser.IDENTIFIER, 0)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.ExprContext)
            else:
                return self.getTypedRuleContext(algoParser.ExprContext,i)


        def NEWLINE(self):
            return self.getToken(algoParser.NEWLINE, 0)

        def block(self):
            return self.getTypedRuleContext(algoParser.BlockContext,0)


        def getRuleIndex(self):
            return algoParser.RULE_forStmt

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForStmt" ):
                listener.enterForStmt(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForStmt" ):
                listener.exitForStmt(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitForStmt" ):
                return visitor.visitForStmt(self)
            else:
                return visitor.visitChildren(self)




    def forStmt(self):

        localctx = algoParser.ForStmtContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_forStmt)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 105
            self.match(algoParser.T__13)
            self.state = 106
            self.match(algoParser.IDENTIFIER)
            self.state = 107
            self.match(algoParser.T__14)
            self.state = 108
            self.expr(0)
            self.state = 109
            self.match(algoParser.T__15)
            self.state = 110
            self.expr(0)
            self.state = 113
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==17:
                self.state = 111
                self.match(algoParser.T__16)
                self.state = 112
                self.expr(0)


            self.state = 115
            self.match(algoParser.T__11)
            self.state = 116
            self.match(algoParser.NEWLINE)
            self.state = 117
            self.block()
            self.state = 118
            self.match(algoParser.T__17)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return algoParser.RULE_expr

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)


    class VariableContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def IDENTIFIER(self):
            return self.getToken(algoParser.IDENTIFIER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable" ):
                return visitor.visitVariable(self)
            else:
                return visitor.visitChildren(self)


    class NumberContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def NUMBER(self):
            return self.getToken(algoParser.NUMBER, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumber" ):
                listener.enterNumber(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumber" ):
                listener.exitNumber(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNumber" ):
                return visitor.visitNumber(self)
            else:
                return visitor.visitChildren(self)


    class MulDivContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.ExprContext)
            else:
                return self.getTypedRuleContext(algoParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMulDiv" ):
                listener.enterMulDiv(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMulDiv" ):
                listener.exitMulDiv(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitMulDiv" ):
                return visitor.visitMulDiv(self)
            else:
                return visitor.visitChildren(self)


    class AddSubContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.ExprContext)
            else:
                return self.getTypedRuleContext(algoParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAddSub" ):
                listener.enterAddSub(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAddSub" ):
                listener.exitAddSub(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAddSub" ):
                return visitor.visitAddSub(self)
            else:
                return visitor.visitChildren(self)


    class ComparisonContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.ExprContext)
            else:
                return self.getTypedRuleContext(algoParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparison" ):
                listener.enterComparison(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparison" ):
                listener.exitComparison(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitComparison" ):
                return visitor.visitComparison(self)
            else:
                return visitor.visitChildren(self)


    class ParensContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(algoParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParens" ):
                listener.enterParens(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParens" ):
                listener.exitParens(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitParens" ):
                return visitor.visitParens(self)
            else:
                return visitor.visitChildren(self)


    class CharContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def CHAR(self):
            return self.getToken(algoParser.CHAR, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterChar" ):
                listener.enterChar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitChar" ):
                listener.exitChar(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitChar" ):
                return visitor.visitChar(self)
            else:
                return visitor.visitChildren(self)


    class LogicalAndOrContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.op = None # Token
            self.copyFrom(ctx)

        def expr(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(algoParser.ExprContext)
            else:
                return self.getTypedRuleContext(algoParser.ExprContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLogicalAndOr" ):
                listener.enterLogicalAndOr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLogicalAndOr" ):
                listener.exitLogicalAndOr(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLogicalAndOr" ):
                return visitor.visitLogicalAndOr(self)
            else:
                return visitor.visitChildren(self)


    class NegateContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def expr(self):
            return self.getTypedRuleContext(algoParser.ExprContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNegate" ):
                listener.enterNegate(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNegate" ):
                listener.exitNegate(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNegate" ):
                return visitor.visitNegate(self)
            else:
                return visitor.visitChildren(self)


    class StringContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def STRING(self):
            return self.getToken(algoParser.STRING, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterString" ):
                listener.enterString(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitString" ):
                listener.exitString(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitString" ):
                return visitor.visitString(self)
            else:
                return visitor.visitChildren(self)


    class BooleanContext(ExprContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a algoParser.ExprContext
            super().__init__(parser)
            self.copyFrom(ctx)

        def BOOLEAN(self):
            return self.getToken(algoParser.BOOLEAN, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBoolean" ):
                listener.enterBoolean(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBoolean" ):
                listener.exitBoolean(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitBoolean" ):
                return visitor.visitBoolean(self)
            else:
                return visitor.visitChildren(self)



    def expr(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = algoParser.ExprContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 22
        self.enterRecursionRule(localctx, 22, self.RULE_expr, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 132
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [22]:
                localctx = algoParser.NegateContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx

                self.state = 121
                self.match(algoParser.T__21)
                self.state = 122
                self.expr(7)
                pass
            elif token in [3]:
                localctx = algoParser.ParensContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 123
                self.match(algoParser.T__2)
                self.state = 124
                self.expr(0)
                self.state = 125
                self.match(algoParser.T__4)
                pass
            elif token in [40]:
                localctx = algoParser.NumberContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 127
                self.match(algoParser.NUMBER)
                pass
            elif token in [41]:
                localctx = algoParser.BooleanContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 128
                self.match(algoParser.BOOLEAN)
                pass
            elif token in [43]:
                localctx = algoParser.StringContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 129
                self.match(algoParser.STRING)
                pass
            elif token in [42]:
                localctx = algoParser.CharContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 130
                self.match(algoParser.CHAR)
                pass
            elif token in [44]:
                localctx = algoParser.VariableContext(self, localctx)
                self._ctx = localctx
                _prevctx = localctx
                self.state = 131
                self.match(algoParser.IDENTIFIER)
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 148
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,10,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 146
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
                    if la_ == 1:
                        localctx = algoParser.MulDivContext(self, algoParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 134
                        if not self.precpred(self._ctx, 11):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 11)")
                        self.state = 135
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==19 or _la==20):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 136
                        self.expr(12)
                        pass

                    elif la_ == 2:
                        localctx = algoParser.AddSubContext(self, algoParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 137
                        if not self.precpred(self._ctx, 10):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 10)")
                        self.state = 138
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==21 or _la==22):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 139
                        self.expr(11)
                        pass

                    elif la_ == 3:
                        localctx = algoParser.ComparisonContext(self, algoParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 140
                        if not self.precpred(self._ctx, 9):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 9)")
                        self.state = 141
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 528482304) != 0)):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 142
                        self.expr(10)
                        pass

                    elif la_ == 4:
                        localctx = algoParser.LogicalAndOrContext(self, algoParser.ExprContext(self, _parentctx, _parentState))
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_expr)
                        self.state = 143
                        if not self.precpred(self._ctx, 8):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 8)")
                        self.state = 144
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==29 or _la==30):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 145
                        self.expr(9)
                        pass

             
                self.state = 150
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,10,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx


    class TypeNameContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return algoParser.RULE_typeName

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTypeName" ):
                listener.enterTypeName(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTypeName" ):
                listener.exitTypeName(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTypeName" ):
                return visitor.visitTypeName(self)
            else:
                return visitor.visitChildren(self)




    def typeName(self):

        localctx = algoParser.TypeNameContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_typeName)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 151
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1097364144128) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[11] = self.expr_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def expr_sempred(self, localctx:ExprContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 11)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 10)
         

            if predIndex == 2:
                return self.precpred(self._ctx, 9)
         

            if predIndex == 3:
                return self.precpred(self._ctx, 8)
         




