// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: conversation.proto

package dk.via.nbnp.databaseserver.protobuf;

public final class ConversationOuterClass {
  private ConversationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SearchConversationDTO_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SearchConversationDTO_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateConversationDTO_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateConversationDTO_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Conversation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Conversation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022conversation.proto\032\nuser.proto\032\nitem.p" +
      "roto\032\rmessage.proto\032\016category.proto\"#\n\025S" +
      "earchConversationDTO\022\n\n\002id\030\001 \001(\003\"J\n\025Crea" +
      "teConversationDTO\022\020\n\010sellerId\030\001 \001(\003\022\017\n\007b" +
      "uyerId\030\002 \001(\003\022\016\n\006itemId\030\003 \001(\003\"\235\001\n\014Convers" +
      "ation\022\n\n\002id\030\001 \001(\003\022\025\n\006seller\030\002 \001(\0132\005.User" +
      "\022\024\n\005buyer\030\003 \001(\0132\005.User\022\023\n\004item\030\004 \001(\0132\005.I" +
      "tem\022#\n\013dateOfStart\030\005 \001(\0132\016.LocalDateTime" +
      "\022\032\n\010messages\030\006 \003(\0132\010.Message2\224\002\n\023Convers" +
      "ationService\022;\n\022createConversation\022\026.Cre" +
      "ateConversationDTO\032\r.Conversation\022A\n\026get" +
      "ConversationsByUser\022\026.SearchConversation" +
      "DTO\032\r.Conversation0\001\022<\n\023getConversationB" +
      "yId\022\026.SearchConversationDTO\032\r.Conversati" +
      "on\022?\n\026deleteConversationById\022\026.SearchCon" +
      "versationDTO\032\r.ConversationB\'\n#dk.via.nb" +
      "np.databaseserver.protobufP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          dk.via.nbnp.databaseserver.protobuf.UserOuterClass.getDescriptor(),
          dk.via.nbnp.databaseserver.protobuf.ItemOuterClass.getDescriptor(),
          dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.getDescriptor(),
          dk.via.nbnp.databaseserver.protobuf.CategoryOuterClass.getDescriptor(),
        });
    internal_static_SearchConversationDTO_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SearchConversationDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SearchConversationDTO_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_CreateConversationDTO_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_CreateConversationDTO_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateConversationDTO_descriptor,
        new java.lang.String[] { "SellerId", "BuyerId", "ItemId", });
    internal_static_Conversation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Conversation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Conversation_descriptor,
        new java.lang.String[] { "Id", "Seller", "Buyer", "Item", "DateOfStart", "Messages", });
    dk.via.nbnp.databaseserver.protobuf.UserOuterClass.getDescriptor();
    dk.via.nbnp.databaseserver.protobuf.ItemOuterClass.getDescriptor();
    dk.via.nbnp.databaseserver.protobuf.MessageOuterClass.getDescriptor();
    dk.via.nbnp.databaseserver.protobuf.CategoryOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
