# framework

## Add in pom.xml

```xml
<properties>
    <ml-framework.version>3.3.4-SNAPSHOT</ml-framework.version>
</properties>
```

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>com.marlonluan</groupId>
            <artifactId>framework-dependencies</artifactId>
            <version>${ml-framework.version}</version>
        </dependency>
    </dependencies>
</dependencyManagement>
```

```xml
<dependencies>
    <dependency>
        <groupId>com.marlonluan</groupId>
        <artifactId>framework</artifactId>
    </dependency>
</dependencies>
```

```xml
<repositories>
    <repository>
        <id>ossrh</id>
        <url>https://s01.oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
</repositories>
```
