// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.unique_type_name

import com.apollographql.apollo.api.ResponseField
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.apollographql.apollo.api.internal.ResponseReader
import com.apollographql.apollo.api.internal.ResponseWriter
import com.example.unique_type_name.type.Episode
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List

@Suppress("NAME_SHADOWING", "UNUSED_ANONYMOUS_PARAMETER", "LocalVariableName",
    "RemoveExplicitTypeArguments", "NestedLambdaShadowedImplicitParameter", "PropertyName",
    "RemoveRedundantQualifierName")
internal object HeroDetailQuery_ResponseAdapter : ResponseAdapter<HeroDetailQuery.Data> {
  private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
    ResponseField.forObject("heroDetailQuery", "heroDetailQuery", null, true, null)
  )

  override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetailQuery.Data {
    return reader.run {
      var heroDetailQuery: HeroDetailQuery.HeroDetailQuery1? = null
      while(true) {
        when (selectField(RESPONSE_FIELDS)) {
          0 -> heroDetailQuery = readObject<HeroDetailQuery.HeroDetailQuery1>(RESPONSE_FIELDS[0]) { reader ->
            HeroDetailQuery_ResponseAdapter.HeroDetailQuery1_ResponseAdapter.fromResponse(reader)
          }
          else -> break
        }
      }
      HeroDetailQuery.Data(
        heroDetailQuery = heroDetailQuery
      )
    }
  }

  override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.Data) {
    if(value.heroDetailQuery == null) {
      writer.writeObject(RESPONSE_FIELDS[0], null)
    } else {
      writer.writeObject(RESPONSE_FIELDS[0]) {
        HeroDetailQuery_ResponseAdapter.HeroDetailQuery1_ResponseAdapter.toResponse(writer, value.heroDetailQuery)
      }
    }
  }

  object Node_ResponseAdapter : ResponseAdapter<HeroDetailQuery.Node> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetailQuery.Node {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        HeroDetailQuery.Node(
          __typename = __typename!!,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.Node) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
    }
  }

  object Edge_ResponseAdapter : ResponseAdapter<HeroDetailQuery.Edge> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forObject("node", "node", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetailQuery.Edge {
      return reader.run {
        var __typename: String? = __typename
        var node: HeroDetailQuery.Node? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> node = readObject<HeroDetailQuery.Node>(RESPONSE_FIELDS[1]) { reader ->
              HeroDetailQuery_ResponseAdapter.Node_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        HeroDetailQuery.Edge(
          __typename = __typename!!,
          node = node
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.Edge) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      if(value.node == null) {
        writer.writeObject(RESPONSE_FIELDS[1], null)
      } else {
        writer.writeObject(RESPONSE_FIELDS[1]) {
          HeroDetailQuery_ResponseAdapter.Node_ResponseAdapter.toResponse(writer, value.node)
        }
      }
    }
  }

  object FriendsConnection_ResponseAdapter : ResponseAdapter<HeroDetailQuery.FriendsConnection> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forInt("totalCount", "totalCount", null, true, null),
      ResponseField.forList("edges", "edges", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetailQuery.FriendsConnection {
      return reader.run {
        var __typename: String? = __typename
        var totalCount: Int? = null
        var edges: List<HeroDetailQuery.Edge?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> totalCount = readInt(RESPONSE_FIELDS[1])
            2 -> edges = readList<HeroDetailQuery.Edge>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<HeroDetailQuery.Edge> { reader ->
                HeroDetailQuery_ResponseAdapter.Edge_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        HeroDetailQuery.FriendsConnection(
          __typename = __typename!!,
          totalCount = totalCount,
          edges = edges
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.FriendsConnection) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeInt(RESPONSE_FIELDS[1], value.totalCount)
      writer.writeList(RESPONSE_FIELDS[2], value.edges) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              HeroDetailQuery_ResponseAdapter.Edge_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
    }
  }

  object Friend1_ResponseAdapter : ResponseAdapter<HeroDetailQuery.Friend1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forObject("friendsConnection", "friendsConnection", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetailQuery.Friend1 {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var friendsConnection: HeroDetailQuery.FriendsConnection? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> friendsConnection = readObject<HeroDetailQuery.FriendsConnection>(RESPONSE_FIELDS[2]) { reader ->
              HeroDetailQuery_ResponseAdapter.FriendsConnection_ResponseAdapter.fromResponse(reader)
            }
            else -> break
          }
        }
        HeroDetailQuery.Friend1(
          __typename = __typename!!,
          name = name!!,
          friendsConnection = friendsConnection!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.Friend1) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
      writer.writeObject(RESPONSE_FIELDS[2]) {
        HeroDetailQuery_ResponseAdapter.FriendsConnection_ResponseAdapter.toResponse(writer, value.friendsConnection)
      }
    }
  }

  object Friend_ResponseAdapter : ResponseAdapter<HeroDetailQuery.Friend> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forList("appearsIn", "appearsIn", null, false, null),
      ResponseField.forList("friends", "friends", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetailQuery.Friend {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var appearsIn: List<Episode?>? = null
        var friends: List<HeroDetailQuery.Friend1?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> appearsIn = readList<Episode>(RESPONSE_FIELDS[2]) { reader ->
              Episode.safeValueOf(reader.readString())
            }
            3 -> friends = readList<HeroDetailQuery.Friend1>(RESPONSE_FIELDS[3]) { reader ->
              reader.readObject<HeroDetailQuery.Friend1> { reader ->
                HeroDetailQuery_ResponseAdapter.Friend1_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        HeroDetailQuery.Friend(
          __typename = __typename!!,
          name = name!!,
          appearsIn = appearsIn!!,
          friends = friends
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.Friend) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
      writer.writeList(RESPONSE_FIELDS[2], value.appearsIn) { value, listItemWriter ->
        value?.forEach { value ->
          listItemWriter.writeString(value?.rawValue)}
      }
      writer.writeList(RESPONSE_FIELDS[3], value.friends) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              HeroDetailQuery_ResponseAdapter.Friend1_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
    }
  }

  object Human_ResponseAdapter : ResponseAdapter<HeroDetailQuery.Human> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forList("friends", "friends", null, true, null),
      ResponseField.forDouble("height", "height", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?): HeroDetailQuery.Human {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var friends: List<HeroDetailQuery.Friend?>? = null
        var height: Double? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> friends = readList<HeroDetailQuery.Friend>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<HeroDetailQuery.Friend> { reader ->
                HeroDetailQuery_ResponseAdapter.Friend_ResponseAdapter.fromResponse(reader)
              }
            }
            3 -> height = readDouble(RESPONSE_FIELDS[3])
            else -> break
          }
        }
        HeroDetailQuery.Human(
          __typename = __typename!!,
          name = name!!,
          friends = friends,
          height = height
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.Human) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
      writer.writeList(RESPONSE_FIELDS[2], value.friends) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              HeroDetailQuery_ResponseAdapter.Friend_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
      writer.writeDouble(RESPONSE_FIELDS[3], value.height)
    }
  }

  object Friend2_ResponseAdapter : ResponseAdapter<HeroDetailQuery.Friend2> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetailQuery.Friend2 {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            else -> break
          }
        }
        HeroDetailQuery.Friend2(
          __typename = __typename!!,
          name = name!!
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.Friend2) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
    }
  }

  object OtherHeroDetailQuery_ResponseAdapter :
      ResponseAdapter<HeroDetailQuery.OtherHeroDetailQuery> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forList("friends", "friends", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetailQuery.OtherHeroDetailQuery {
      return reader.run {
        var __typename: String? = __typename
        var name: String? = null
        var friends: List<HeroDetailQuery.Friend2?>? = null
        while(true) {
          when (selectField(RESPONSE_FIELDS)) {
            0 -> __typename = readString(RESPONSE_FIELDS[0])
            1 -> name = readString(RESPONSE_FIELDS[1])
            2 -> friends = readList<HeroDetailQuery.Friend2>(RESPONSE_FIELDS[2]) { reader ->
              reader.readObject<HeroDetailQuery.Friend2> { reader ->
                HeroDetailQuery_ResponseAdapter.Friend2_ResponseAdapter.fromResponse(reader)
              }
            }
            else -> break
          }
        }
        HeroDetailQuery.OtherHeroDetailQuery(
          __typename = __typename!!,
          name = name!!,
          friends = friends
        )
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.OtherHeroDetailQuery) {
      writer.writeString(RESPONSE_FIELDS[0], value.__typename)
      writer.writeString(RESPONSE_FIELDS[1], value.name)
      writer.writeList(RESPONSE_FIELDS[2], value.friends) { value, listItemWriter ->
        value?.forEach { value ->
          if(value == null) {
            listItemWriter.writeObject(null)
          } else {
            listItemWriter.writeObject {
              HeroDetailQuery_ResponseAdapter.Friend2_ResponseAdapter.toResponse(writer, value)
            }
          }
        }
      }
    }
  }

  object HeroDetailQuery1_ResponseAdapter : ResponseAdapter<HeroDetailQuery.HeroDetailQuery1> {
    private val RESPONSE_FIELDS: Array<ResponseField> = arrayOf(
      ResponseField.forString("__typename", "__typename", null, false, null),
      ResponseField.forString("name", "name", null, false, null),
      ResponseField.forList("friends", "friends", null, true, null)
    )

    override fun fromResponse(reader: ResponseReader, __typename: String?):
        HeroDetailQuery.HeroDetailQuery1 {
      val typename = __typename ?: reader.readString(RESPONSE_FIELDS[0])
      return when(typename) {
        "Human" -> HeroDetailQuery_ResponseAdapter.Human_ResponseAdapter.fromResponse(reader, typename)
        else -> HeroDetailQuery_ResponseAdapter.OtherHeroDetailQuery_ResponseAdapter.fromResponse(reader, typename)
      }
    }

    override fun toResponse(writer: ResponseWriter, value: HeroDetailQuery.HeroDetailQuery1) {
      when(value) {
        is HeroDetailQuery.Human -> HeroDetailQuery_ResponseAdapter.Human_ResponseAdapter.toResponse(writer, value)
        is HeroDetailQuery.OtherHeroDetailQuery -> HeroDetailQuery_ResponseAdapter.OtherHeroDetailQuery_ResponseAdapter.toResponse(writer, value)
      }
    }
  }
}