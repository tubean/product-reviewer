/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package common.avro.security.events;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SecurityCheckProcessed extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3519402937514779826L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SecurityCheckProcessed\",\"namespace\":\"common.avro.security.events\",\"fields\":[{\"name\":\"task_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"review\",\"type\":{\"type\":\"record\",\"name\":\"Review\",\"namespace\":\"common.avro.reviews.entities\",\"fields\":[{\"name\":\"product_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"created_at\",\"type\":\"long\"},{\"name\":\"status\",\"type\":{\"type\":\"enum\",\"name\":\"ReviewStatus\",\"symbols\":[\"PROCESSING\",\"APPROVED\",\"REJECTED\"]}},{\"name\":\"review_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"rating\",\"type\":\"int\",\"doc\":\"review value, from 1 to 5\"},{\"name\":\"product_name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"content\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Review text if provided\",\"default\":null},{\"name\":\"user_id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"username\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"user_email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}},{\"name\":\"status\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"failureMessage\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SecurityCheckProcessed> ENCODER =
      new BinaryMessageEncoder<SecurityCheckProcessed>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SecurityCheckProcessed> DECODER =
      new BinaryMessageDecoder<SecurityCheckProcessed>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SecurityCheckProcessed> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SecurityCheckProcessed> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SecurityCheckProcessed> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SecurityCheckProcessed>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SecurityCheckProcessed to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SecurityCheckProcessed from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SecurityCheckProcessed instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SecurityCheckProcessed fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.String task_id;
  @Deprecated public common.avro.reviews.entities.Review review;
  @Deprecated public java.lang.String status;
  @Deprecated public java.lang.String failureMessage;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SecurityCheckProcessed() {}

  /**
   * All-args constructor.
   * @param task_id The new value for task_id
   * @param review The new value for review
   * @param status The new value for status
   * @param failureMessage The new value for failureMessage
   */
  public SecurityCheckProcessed(java.lang.String task_id, common.avro.reviews.entities.Review review, java.lang.String status, java.lang.String failureMessage) {
    this.task_id = task_id;
    this.review = review;
    this.status = status;
    this.failureMessage = failureMessage;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return task_id;
    case 1: return review;
    case 2: return status;
    case 3: return failureMessage;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: task_id = (java.lang.String)value$; break;
    case 1: review = (common.avro.reviews.entities.Review)value$; break;
    case 2: status = (java.lang.String)value$; break;
    case 3: failureMessage = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'task_id' field.
   * @return The value of the 'task_id' field.
   */
  public java.lang.String getTaskId() {
    return task_id;
  }


  /**
   * Sets the value of the 'task_id' field.
   * @param value the value to set.
   */
  public void setTaskId(java.lang.String value) {
    this.task_id = value;
  }

  /**
   * Gets the value of the 'review' field.
   * @return The value of the 'review' field.
   */
  public common.avro.reviews.entities.Review getReview() {
    return review;
  }


  /**
   * Sets the value of the 'review' field.
   * @param value the value to set.
   */
  public void setReview(common.avro.reviews.entities.Review value) {
    this.review = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.String getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.String value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'failureMessage' field.
   * @return The value of the 'failureMessage' field.
   */
  public java.lang.String getFailureMessage() {
    return failureMessage;
  }


  /**
   * Sets the value of the 'failureMessage' field.
   * @param value the value to set.
   */
  public void setFailureMessage(java.lang.String value) {
    this.failureMessage = value;
  }

  /**
   * Creates a new SecurityCheckProcessed RecordBuilder.
   * @return A new SecurityCheckProcessed RecordBuilder
   */
  public static common.avro.security.events.SecurityCheckProcessed.Builder newBuilder() {
    return new common.avro.security.events.SecurityCheckProcessed.Builder();
  }

  /**
   * Creates a new SecurityCheckProcessed RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SecurityCheckProcessed RecordBuilder
   */
  public static common.avro.security.events.SecurityCheckProcessed.Builder newBuilder(common.avro.security.events.SecurityCheckProcessed.Builder other) {
    if (other == null) {
      return new common.avro.security.events.SecurityCheckProcessed.Builder();
    } else {
      return new common.avro.security.events.SecurityCheckProcessed.Builder(other);
    }
  }

  /**
   * Creates a new SecurityCheckProcessed RecordBuilder by copying an existing SecurityCheckProcessed instance.
   * @param other The existing instance to copy.
   * @return A new SecurityCheckProcessed RecordBuilder
   */
  public static common.avro.security.events.SecurityCheckProcessed.Builder newBuilder(common.avro.security.events.SecurityCheckProcessed other) {
    if (other == null) {
      return new common.avro.security.events.SecurityCheckProcessed.Builder();
    } else {
      return new common.avro.security.events.SecurityCheckProcessed.Builder(other);
    }
  }

  /**
   * RecordBuilder for SecurityCheckProcessed instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SecurityCheckProcessed>
    implements org.apache.avro.data.RecordBuilder<SecurityCheckProcessed> {

    private java.lang.String task_id;
    private common.avro.reviews.entities.Review review;
    private common.avro.reviews.entities.Review.Builder reviewBuilder;
    private java.lang.String status;
    private java.lang.String failureMessage;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(common.avro.security.events.SecurityCheckProcessed.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.task_id)) {
        this.task_id = data().deepCopy(fields()[0].schema(), other.task_id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.review)) {
        this.review = data().deepCopy(fields()[1].schema(), other.review);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasReviewBuilder()) {
        this.reviewBuilder = common.avro.reviews.entities.Review.newBuilder(other.getReviewBuilder());
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.failureMessage)) {
        this.failureMessage = data().deepCopy(fields()[3].schema(), other.failureMessage);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing SecurityCheckProcessed instance
     * @param other The existing instance to copy.
     */
    private Builder(common.avro.security.events.SecurityCheckProcessed other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.task_id)) {
        this.task_id = data().deepCopy(fields()[0].schema(), other.task_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.review)) {
        this.review = data().deepCopy(fields()[1].schema(), other.review);
        fieldSetFlags()[1] = true;
      }
      this.reviewBuilder = null;
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.failureMessage)) {
        this.failureMessage = data().deepCopy(fields()[3].schema(), other.failureMessage);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'task_id' field.
      * @return The value.
      */
    public java.lang.String getTaskId() {
      return task_id;
    }


    /**
      * Sets the value of the 'task_id' field.
      * @param value The value of 'task_id'.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder setTaskId(java.lang.String value) {
      validate(fields()[0], value);
      this.task_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'task_id' field has been set.
      * @return True if the 'task_id' field has been set, false otherwise.
      */
    public boolean hasTaskId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'task_id' field.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder clearTaskId() {
      task_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'review' field.
      * @return The value.
      */
    public common.avro.reviews.entities.Review getReview() {
      return review;
    }


    /**
      * Sets the value of the 'review' field.
      * @param value The value of 'review'.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder setReview(common.avro.reviews.entities.Review value) {
      validate(fields()[1], value);
      this.reviewBuilder = null;
      this.review = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'review' field has been set.
      * @return True if the 'review' field has been set, false otherwise.
      */
    public boolean hasReview() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'review' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public common.avro.reviews.entities.Review.Builder getReviewBuilder() {
      if (reviewBuilder == null) {
        if (hasReview()) {
          setReviewBuilder(common.avro.reviews.entities.Review.newBuilder(review));
        } else {
          setReviewBuilder(common.avro.reviews.entities.Review.newBuilder());
        }
      }
      return reviewBuilder;
    }

    /**
     * Sets the Builder instance for the 'review' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */
    public common.avro.security.events.SecurityCheckProcessed.Builder setReviewBuilder(common.avro.reviews.entities.Review.Builder value) {
      clearReview();
      reviewBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'review' field has an active Builder instance
     * @return True if the 'review' field has an active Builder instance
     */
    public boolean hasReviewBuilder() {
      return reviewBuilder != null;
    }

    /**
      * Clears the value of the 'review' field.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder clearReview() {
      review = null;
      reviewBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.String getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder setStatus(java.lang.String value) {
      validate(fields()[2], value);
      this.status = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder clearStatus() {
      status = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'failureMessage' field.
      * @return The value.
      */
    public java.lang.String getFailureMessage() {
      return failureMessage;
    }


    /**
      * Sets the value of the 'failureMessage' field.
      * @param value The value of 'failureMessage'.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder setFailureMessage(java.lang.String value) {
      validate(fields()[3], value);
      this.failureMessage = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'failureMessage' field has been set.
      * @return True if the 'failureMessage' field has been set, false otherwise.
      */
    public boolean hasFailureMessage() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'failureMessage' field.
      * @return This builder.
      */
    public common.avro.security.events.SecurityCheckProcessed.Builder clearFailureMessage() {
      failureMessage = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SecurityCheckProcessed build() {
      try {
        SecurityCheckProcessed record = new SecurityCheckProcessed();
        record.task_id = fieldSetFlags()[0] ? this.task_id : (java.lang.String) defaultValue(fields()[0]);
        if (reviewBuilder != null) {
          try {
            record.review = this.reviewBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("review"));
            throw e;
          }
        } else {
          record.review = fieldSetFlags()[1] ? this.review : (common.avro.reviews.entities.Review) defaultValue(fields()[1]);
        }
        record.status = fieldSetFlags()[2] ? this.status : (java.lang.String) defaultValue(fields()[2]);
        record.failureMessage = fieldSetFlags()[3] ? this.failureMessage : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SecurityCheckProcessed>
    WRITER$ = (org.apache.avro.io.DatumWriter<SecurityCheckProcessed>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SecurityCheckProcessed>
    READER$ = (org.apache.avro.io.DatumReader<SecurityCheckProcessed>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.task_id);

    this.review.customEncode(out);

    out.writeString(this.status);

    if (this.failureMessage == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.failureMessage);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.task_id = in.readString();

      if (this.review == null) {
        this.review = new common.avro.reviews.entities.Review();
      }
      this.review.customDecode(in);

      this.status = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.failureMessage = null;
      } else {
        this.failureMessage = in.readString();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.task_id = in.readString();
          break;

        case 1:
          if (this.review == null) {
            this.review = new common.avro.reviews.entities.Review();
          }
          this.review.customDecode(in);
          break;

        case 2:
          this.status = in.readString();
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.failureMessage = null;
          } else {
            this.failureMessage = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










