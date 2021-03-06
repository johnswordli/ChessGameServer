// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/GM.proto

package info.xiaomo.server.protocol;

import javax.annotation.Generated;

@Generated("protobuf")
public final class GMProto {
    private GMProto() {}

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CloseServerRequestOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CloseServerRequest)
            com.google.protobuf.MessageOrBuilder {
    }

    /**
     * Protobuf type {@code CloseServerRequest}
     */
    public  static final class CloseServerRequest extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CloseServerRequest)
            CloseServerRequestOrBuilder {
        // Use CloseServerRequest.newBuilder() to construct.
        private CloseServerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CloseServerRequest() {
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private CloseServerRequest(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return GMProto.internal_static_CloseServerRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return GMProto.internal_static_CloseServerRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            CloseServerRequest.class, Builder.class);
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CloseServerRequest)) {
                return super.equals(obj);
            }
            CloseServerRequest other = (CloseServerRequest) obj;

            boolean result = true;
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static CloseServerRequest parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static CloseServerRequest parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static CloseServerRequest parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static CloseServerRequest parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static CloseServerRequest parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static CloseServerRequest parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static CloseServerRequest parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static CloseServerRequest parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static CloseServerRequest parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static CloseServerRequest parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static CloseServerRequest parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static CloseServerRequest parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CloseServerRequest prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code CloseServerRequest}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CloseServerRequest)
                CloseServerRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return GMProto.internal_static_CloseServerRequest_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return GMProto.internal_static_CloseServerRequest_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                CloseServerRequest.class, Builder.class);
            }

            // Construct using GMProto.CloseServerRequest.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return GMProto.internal_static_CloseServerRequest_descriptor;
            }

            public CloseServerRequest getDefaultInstanceForType() {
                return CloseServerRequest.getDefaultInstance();
            }

            public CloseServerRequest build() {
                CloseServerRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public CloseServerRequest buildPartial() {
                CloseServerRequest result = new CloseServerRequest(this);
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof CloseServerRequest) {
                    return mergeFrom((CloseServerRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(CloseServerRequest other) {
                if (other == CloseServerRequest.getDefaultInstance()) return this;
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                CloseServerRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (CloseServerRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:CloseServerRequest)
        }

        // @@protoc_insertion_point(class_scope:CloseServerRequest)
        private static final CloseServerRequest DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new CloseServerRequest();
        }

        public static CloseServerRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CloseServerRequest>
                PARSER = new com.google.protobuf.AbstractParser<CloseServerRequest>() {
            public CloseServerRequest parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CloseServerRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CloseServerRequest> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<CloseServerRequest> getParserForType() {
            return PARSER;
        }

        public CloseServerRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface CloseServerResponseOrBuilder extends
            // @@protoc_insertion_point(interface_extends:CloseServerResponse)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>string resMsg = 1;</code>
         */
        String getResMsg();

        /**
         * <code>string resMsg = 1;</code>
         */
        com.google.protobuf.ByteString
        getResMsgBytes();
    }

    /**
     * Protobuf type {@code CloseServerResponse}
     */
    public  static final class CloseServerResponse extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:CloseServerResponse)
            CloseServerResponseOrBuilder {
        // Use CloseServerResponse.newBuilder() to construct.
        private CloseServerResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CloseServerResponse() {
            resMsg_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private CloseServerResponse(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!input.skipField(tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            String s = input.readStringRequireUtf8();

                            resMsg_ = s;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return GMProto.internal_static_CloseServerResponse_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return GMProto.internal_static_CloseServerResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            CloseServerResponse.class, Builder.class);
        }

        public static final int RESMSG_FIELD_NUMBER = 1;
        private volatile Object resMsg_;

        /**
         * <code>string resMsg = 1;</code>
         */
        public String getResMsg() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                resMsg_ = s;
                return s;
            }
        }

        /**
         * <code>string resMsg = 1;</code>
         */
        public com.google.protobuf.ByteString
        getResMsgBytes() {
            Object ref = resMsg_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                resMsg_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (!getResMsgBytes().isEmpty()) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resMsg_);
            }
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!getResMsgBytes().isEmpty()) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resMsg_);
            }
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CloseServerResponse)) {
                return super.equals(obj);
            }
            CloseServerResponse other = (CloseServerResponse) obj;

            boolean result = true;
            result = result && getResMsg()
                    .equals(other.getResMsg());
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + RESMSG_FIELD_NUMBER;
            hash = (53 * hash) + getResMsg().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static CloseServerResponse parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static CloseServerResponse parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static CloseServerResponse parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static CloseServerResponse parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static CloseServerResponse parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static CloseServerResponse parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static CloseServerResponse parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static CloseServerResponse parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static CloseServerResponse parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static CloseServerResponse parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static CloseServerResponse parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static CloseServerResponse parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CloseServerResponse prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code CloseServerResponse}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:CloseServerResponse)
                CloseServerResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return GMProto.internal_static_CloseServerResponse_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return GMProto.internal_static_CloseServerResponse_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                CloseServerResponse.class, Builder.class);
            }

            // Construct using GMProto.CloseServerResponse.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                resMsg_ = "";

                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return GMProto.internal_static_CloseServerResponse_descriptor;
            }

            public CloseServerResponse getDefaultInstanceForType() {
                return CloseServerResponse.getDefaultInstance();
            }

            public CloseServerResponse build() {
                CloseServerResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public CloseServerResponse buildPartial() {
                CloseServerResponse result = new CloseServerResponse(this);
                result.resMsg_ = resMsg_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof CloseServerResponse) {
                    return mergeFrom((CloseServerResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(CloseServerResponse other) {
                if (other == CloseServerResponse.getDefaultInstance()) return this;
                if (!other.getResMsg().isEmpty()) {
                    resMsg_ = other.resMsg_;
                    onChanged();
                }
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                CloseServerResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (CloseServerResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private Object resMsg_ = "";

            /**
             * <code>string resMsg = 1;</code>
             */
            public String getResMsg() {
                Object ref = resMsg_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    resMsg_ = s;
                    return s;
                } else {
                    return (String) ref;
                }
            }

            /**
             * <code>string resMsg = 1;</code>
             */
            public com.google.protobuf.ByteString
            getResMsgBytes() {
                Object ref = resMsg_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    resMsg_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string resMsg = 1;</code>
             */
            public Builder setResMsg(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                resMsg_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string resMsg = 1;</code>
             */
            public Builder clearResMsg() {

                resMsg_ = getDefaultInstance().getResMsg();
                onChanged();
                return this;
            }

            /**
             * <code>string resMsg = 1;</code>
             */
            public Builder setResMsgBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                resMsg_ = value;
                onChanged();
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return this;
            }


            // @@protoc_insertion_point(builder_scope:CloseServerResponse)
        }

        // @@protoc_insertion_point(class_scope:CloseServerResponse)
        private static final CloseServerResponse DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new CloseServerResponse();
        }

        public static CloseServerResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CloseServerResponse>
                PARSER = new com.google.protobuf.AbstractParser<CloseServerResponse>() {
            public CloseServerResponse parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new CloseServerResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<CloseServerResponse> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<CloseServerResponse> getParserForType() {
            return PARSER;
        }

        public CloseServerResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CloseServerRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CloseServerRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CloseServerResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CloseServerResponse_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        String[] descriptorData = {
                "\n\016proto/GM.proto\"\024\n\022CloseServerRequest\"%" +
                        "\n\023CloseServerResponse\022\016\n\006resMsg\030\001 \001(\tB,\n" +
                        "!info.xiaomo.server.protocol.protoB\007GMPr" +
                        "otob\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        internal_static_CloseServerRequest_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_CloseServerRequest_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CloseServerRequest_descriptor,
                new String[] { });
        internal_static_CloseServerResponse_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_CloseServerResponse_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_CloseServerResponse_descriptor,
                new String[] { "ResMsg", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
