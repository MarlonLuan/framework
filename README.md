# framework

## Add in pom.xml

```xml
<properties>
    <ml-framework.version>3.5.8-SNAPSHOT</ml-framework.version>
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
        <id>central-portal-snapshots</id>
        <url>https://central.sonatype.com/repository/maven-snapshots/</url>
        <releases>
            <enabled>false</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```
